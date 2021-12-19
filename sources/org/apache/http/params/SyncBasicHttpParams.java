package org.apache.http.params;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SyncBasicHttpParams extends BasicHttpParams {
    private static final long serialVersionUID = 5387834869062660642L;

    static {
        Covode.recordClassIndex(106477);
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized void clear() {
        MethodCollector.m26663i(3351);
        super.clear();
        MethodCollector.m26664o(3351);
    }

    @Override // org.apache.http.params.BasicHttpParams, java.lang.Object
    public synchronized Object clone() {
        Object clone;
        MethodCollector.m26663i(3480);
        clone = super.clone();
        MethodCollector.m26664o(3480);
        return clone;
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public synchronized Object getParameter(String str) {
        Object parameter;
        MethodCollector.m26663i(3344);
        parameter = super.getParameter(str);
        MethodCollector.m26664o(3344);
        return parameter;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized boolean isParameterSet(String str) {
        boolean isParameterSet;
        MethodCollector.m26663i(3346);
        isParameterSet = super.isParameterSet(str);
        MethodCollector.m26664o(3346);
        return isParameterSet;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized boolean isParameterSetLocally(String str) {
        boolean isParameterSetLocally;
        MethodCollector.m26663i(3348);
        isParameterSetLocally = super.isParameterSetLocally(str);
        MethodCollector.m26664o(3348);
        return isParameterSetLocally;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized boolean removeParameter(String str) {
        boolean removeParameter;
        MethodCollector.m26663i(3341);
        removeParameter = super.removeParameter(str);
        MethodCollector.m26664o(3341);
        return removeParameter;
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public synchronized HttpParams setParameter(String str, Object obj) {
        HttpParams parameter;
        MethodCollector.m26663i(3343);
        parameter = super.setParameter(str, obj);
        MethodCollector.m26664o(3343);
        return parameter;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized void setParameters(String[] strArr, Object obj) {
        MethodCollector.m26663i(3350);
        super.setParameters(strArr, obj);
        MethodCollector.m26664o(3350);
    }
}
