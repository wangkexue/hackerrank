(defun str-reduce (str &optional (r nil))
    (cond ((not str) (reverse r))
        ((find (car str) r) (str-reduce (cdr str) r))
        (t (str-reduce (cdr str) (cons (car str) r)))))

(setq str (coerce (read-line) 'list))

(princ (coerce (str-reduce str) 'string))
