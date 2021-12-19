package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel */
public final class RecordMVViewModel extends BaseJediViewModel<RecordMVState> {

    /* renamed from: a */
    public Effect f177204a;

    /* renamed from: b */
    public ShortVideoContext f177205b;

    static {
        Covode.recordClassIndex(91985);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new RecordMVState(null, null, 3, null);
    }

    /* renamed from: a */
    public final ShortVideoContext mo122687a() {
        ShortVideoContext shortVideoContext = this.f177205b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        return shortVideoContext;
    }
}
