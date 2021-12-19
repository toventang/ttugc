package com.kakao.auth.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PageableContext {
    private String afterUrl;
    private String beforeUrl;
    private final int limit;
    private final int offset;
    private final String order;

    static {
        Covode.recordClassIndex(33884);
    }

    public int getLimit() {
        return this.limit;
    }

    public int getOffset() {
        return this.offset;
    }

    public String getOrder() {
        return this.order;
    }

    public synchronized String getAfterUrl() {
        String str;
        MethodCollector.m26663i(11784);
        str = this.afterUrl;
        MethodCollector.m26664o(11784);
        return str;
    }

    public synchronized String getBeforeUrl() {
        String str;
        MethodCollector.m26663i(11783);
        str = this.beforeUrl;
        MethodCollector.m26664o(11783);
        return str;
    }

    public synchronized boolean hasNext() {
        MethodCollector.m26663i(11953);
        if (this.afterUrl != null) {
            MethodCollector.m26664o(11953);
            return true;
        }
        MethodCollector.m26664o(11953);
        return false;
    }

    public synchronized void setAfterUrl(String str) {
        MethodCollector.m26663i(11952);
        this.afterUrl = str;
        MethodCollector.m26664o(11952);
    }

    public synchronized void setBeforeUrl(String str) {
        MethodCollector.m26663i(11785);
        this.beforeUrl = str;
        MethodCollector.m26664o(11785);
    }

    public PageableContext(int i, int i2, String str) {
        this.offset = i;
        this.limit = i2;
        this.order = str;
    }
}
