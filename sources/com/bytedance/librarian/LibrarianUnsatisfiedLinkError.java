package com.bytedance.librarian;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;

public class LibrarianUnsatisfiedLinkError extends UnsatisfiedLinkError {

    /* renamed from: a */
    private static final ArrayList<LibrarianUnsatisfiedLinkError> f48916a = new ArrayList<>();

    /* renamed from: a */
    public static UnsatisfiedLinkError[] m38991a() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        MethodCollector.m26663i(3227);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = f48916a;
        synchronized (arrayList) {
            try {
                unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) arrayList.toArray(new UnsatisfiedLinkError[0]);
            } finally {
                MethodCollector.m26664o(3227);
            }
        }
        return unsatisfiedLinkErrorArr;
    }

    LibrarianUnsatisfiedLinkError(String str) {
        super(str);
        MethodCollector.m26663i(3223);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = f48916a;
        synchronized (arrayList) {
            try {
                arrayList.add(this);
            } finally {
                MethodCollector.m26664o(3223);
            }
        }
    }

    LibrarianUnsatisfiedLinkError(String str, Throwable th) {
        super(str);
        MethodCollector.m26663i(3225);
        initCause(th);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = f48916a;
        synchronized (arrayList) {
            try {
                arrayList.add(this);
            } finally {
                MethodCollector.m26664o(3225);
            }
        }
    }
}
