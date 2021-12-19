package com.lynx.tasm.navigator;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;

/* renamed from: com.lynx.tasm.navigator.e */
public final class C28834e extends LruCache<C28833d, LynxView> {

    /* renamed from: a */
    private AbstractC28835a f68077a;

    /* renamed from: com.lynx.tasm.navigator.e$a */
    public interface AbstractC28835a {
        static {
            Covode.recordClassIndex(34943);
        }

        /* renamed from: c */
        void mo49959c(LynxView lynxView);
    }

    static {
        Covode.recordClassIndex(34942);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ LynxView create(C28833d dVar) {
        return null;
    }

    public C28834e(int i, AbstractC28835a aVar) {
        super(i);
        this.f68077a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.util.LruCache
    public final /* synthetic */ void entryRemoved(boolean z, C28833d dVar, LynxView lynxView, LynxView lynxView2) {
        AbstractC28835a aVar;
        LynxView lynxView3 = lynxView;
        if (z && (aVar = this.f68077a) != null) {
            aVar.mo49959c(lynxView3);
        }
    }
}
