package org.apache.http.params;

import com.bytedance.covode.number.Covode;

public interface HttpParams {
    static {
        Covode.recordClassIndex(106475);
    }

    int getIntParameter(String str, int i);

    Object getParameter(String str);

    HttpParams setBooleanParameter(String str, boolean z);

    HttpParams setIntParameter(String str, int i);

    HttpParams setParameter(String str, Object obj);
}
