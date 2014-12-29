(defun str-reduce (str &optional (r nil))
    (cond ((not str) (reverse r))
        ((find (car str) r) (str-reduce (cdr str) r))
        (t (str-reduce (cdr str) (cons (car str) r)))))

(setq str (coerce (read-line) 'list))

(princ (coerce (str-reduce str) 'string))

;; there is a build-in solution
;; derive from cal_whale
(let ((s (read-line)))
     (princ (remove-duplicates s :test #'char-equal :from-end t)))
