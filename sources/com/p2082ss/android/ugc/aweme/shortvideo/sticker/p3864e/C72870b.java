package com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3864e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63215bd;
import com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75382h;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.b */
public final class C72870b implements AbstractC75382h {

    /* renamed from: a */
    Effect f163502a;

    /* renamed from: b */
    public OnUnlockShareFinishListener f163503b;

    /* renamed from: c */
    String f163504c;

    /* renamed from: d */
    AbstractC63215bd.AbstractC63216a f163505d = new AbstractC63215bd.AbstractC63216a() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3864e.C72870b.C728733 */

        static {
            Covode.recordClassIndex(85565);
        }
    };

    /* renamed from: e */
    private Context f163506e;

    /* renamed from: f */
    private AbstractC63215bd.AbstractC63217b f163507f = new AbstractC63215bd.AbstractC63217b() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3864e.C72870b.C728711 */

        static {
            Covode.recordClassIndex(85563);
        }
    };

    /* renamed from: g */
    private AbstractC27255q<IStickerUtilsService> f163508g = new AbstractC27255q<IStickerUtilsService>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3864e.C72870b.C728722 */

        /* renamed from: a */
        IStickerUtilsService f163512a;

        static {
            Covode.recordClassIndex(85564);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ IStickerUtilsService mo5560b() {
            if (this.f163512a == null) {
                this.f163512a = AVExternalServiceImpl.m113114a().infoService().stickerInfo();
            }
            return this.f163512a;
        }
    };

    /* renamed from: h */
    private boolean f163509h = false;

    /* renamed from: i */
    private boolean f163510i = false;

    static {
        Covode.recordClassIndex(85562);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75382h
    /* renamed from: a */
    public final void mo115244a(Effect effect) {
        this.f163502a = effect;
    }

    public C72870b(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z) {
        this.f163504c = str;
        this.f163506e = context;
        this.f163502a = effect;
        this.f163503b = onUnlockShareFinishListener;
        this.f163509h = true;
        this.f163510i = z;
    }
}
