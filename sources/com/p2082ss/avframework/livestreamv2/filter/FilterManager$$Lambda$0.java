package com.p2082ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import com.p2082ss.avframework.utils.AVLog;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$$Lambda$0 */
public final /* synthetic */ class FilterManager$$Lambda$0 implements IFilterManager.ErrorListener {
    static final IFilterManager.ErrorListener $instance = new FilterManager$$Lambda$0();

    static {
        Covode.recordClassIndex(100459);
    }

    private FilterManager$$Lambda$0() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager.ErrorListener
    public final void onError(int i, String str) {
        AVLog.ioe("FilterManager", "Effect api return error: " + i + ". Calling info: " + str);
    }
}
