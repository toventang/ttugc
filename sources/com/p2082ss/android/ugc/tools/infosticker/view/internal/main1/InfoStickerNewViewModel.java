package com.p2082ss.android.ugc.tools.infosticker.view.internal.main1;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72828b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84533a;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84542j;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.EnumC84544l;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.concurrent.LinkedBlockingQueue;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerNewViewModel */
public final class InfoStickerNewViewModel extends HumbleViewModel implements AbstractC33974au {

    /* renamed from: a */
    public boolean f189534a;

    /* renamed from: b */
    public final Context f189535b;

    /* renamed from: c */
    private final LinkedBlockingQueue<InfoStickerEffect> f189536c;

    /* renamed from: d */
    private boolean f189537d;

    /* renamed from: e */
    private final C88411a f189538e;

    /* renamed from: f */
    private final C84823c f189539f;

    /* renamed from: g */
    private final AbstractC84533a f189540g;

    static {
        Covode.recordClassIndex(98802);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerNewViewModel$c */
    public static final class C84823c implements AbstractC72827a {

        /* renamed from: a */
        final /* synthetic */ InfoStickerNewViewModel f189543a;

        static {
            Covode.recordClassIndex(98805);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a
        /* renamed from: b */
        public final void mo115162b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a
        /* renamed from: a */
        public final void mo115161a() {
            if (C72829c.m128605c(this.f189543a.f189535b)) {
                this.f189543a.mo129668a();
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f189536c.clear();
        this.f189538e.dispose();
        C72828b.m128598b(this.f189539f);
    }

    /* renamed from: a */
    public final void mo129668a() {
        if (!isDestroyed() && this.f189537d && !this.f189534a && !C72829c.m128605c(this.f189535b)) {
            this.f189534a = true;
            if (this.f189536c.poll() == null) {
                this.f189534a = false;
                return;
            }
            this.f189538e.mo142945a(this.f189540g.mo129475a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88392a.m153583a()).mo143254a(new C84821a(this), new C84822b(this)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerNewViewModel$b */
    public static final class C84822b<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerNewViewModel f189542a;

        static {
            Covode.recordClassIndex(98804);
        }

        C84822b(InfoStickerNewViewModel infoStickerNewViewModel) {
            this.f189542a = infoStickerNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f189542a.f189534a = false;
            this.f189542a.mo129668a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerNewViewModel$a */
    public static final class C84821a<T> implements AbstractC88433f<C84542j> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerNewViewModel f189541a;

        static {
            Covode.recordClassIndex(98803);
        }

        C84821a(InfoStickerNewViewModel infoStickerNewViewModel) {
            this.f189541a = infoStickerNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C84542j jVar) {
            C84542j jVar2 = jVar;
            if (jVar2.f188945b.f188960a == EnumC84544l.INFO_STICKER_STATE_DOWNLOAD_SUCCESS || jVar2.f188945b.f188960a == EnumC84544l.INFO_STICKER_STATE_DOWNLOAD_FAILED) {
                this.f189541a.f189534a = false;
                this.f189541a.mo129668a();
            }
        }
    }
}
