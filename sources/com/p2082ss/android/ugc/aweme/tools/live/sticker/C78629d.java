package com.p2082ss.android.ugc.aweme.tools.live.sticker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2308aj.C33475b;
import com.p2082ss.android.ugc.aweme.p2477ci.C36081b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.sticker.C75404l;
import com.p2082ss.android.ugc.aweme.sticker.C75449o;
import com.p2082ss.android.ugc.aweme.sticker.IStickerViewService;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.favorite.C75363c;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.C75281a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.AbstractC75292d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75297c;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75345d;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75403e;
import com.p2082ss.android.ugc.aweme.sticker.p3964l.AbstractC75413a;
import com.p2082ss.android.ugc.aweme.sticker.p3967n.AbstractC75448a;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75520e;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75522g;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75572h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75578a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75657q;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75615a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a.AbstractC75586c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a.C75585b;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.C75855a;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.p3996a.C75858a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75938j;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.AbstractC75997b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76018b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76177c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76245b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.utils.C80249bj;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d */
public final class C78629d extends AbstractC75578a {

    /* renamed from: t */
    public static final C78635d f176688t = new C78635d((byte) 0);

    /* renamed from: a */
    final AbstractC89244h<AbstractC46415f> f176689a;

    /* renamed from: h */
    final AbstractC75655o f176690h;

    /* renamed from: i */
    final AbstractC75300d f176691i;

    /* renamed from: j */
    public final AbstractC84917a f176692j;

    /* renamed from: k */
    public AbstractC75413a f176693k;

    /* renamed from: l */
    public volatile boolean f176694l;

    /* renamed from: m */
    public Effect f176695m;

    /* renamed from: n */
    FrameLayout f176696n;

    /* renamed from: o */
    AbstractC0952i f176697o;

    /* renamed from: p */
    public final C78628c f176698p;

    /* renamed from: q */
    final C21582f f176699q;

    /* renamed from: r */
    public ActivityC0218d f176700r;

    /* renamed from: s */
    public String f176701s;

    /* renamed from: u */
    private final AbstractC89244h f176702u = C89250i.m154773a((AbstractC89171a) new C78645m(this));

    /* renamed from: v */
    private final AbstractC75586c f176703v;

    /* renamed from: w */
    private final C88411a f176704w;

    /* renamed from: x */
    private final AbstractC89244h f176705x;

    static {
        Covode.recordClassIndex(91769);
    }

    /* renamed from: d */
    public final AbstractC14177d mo122531d() {
        return (AbstractC14177d) this.f176702u.getValue();
    }

    /* renamed from: e */
    public final C75574j mo122532e() {
        return (C75574j) this.f176705x.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$d */
    public static final class C78635d {
        static {
            Covode.recordClassIndex(91775);
        }

        private C78635d() {
        }

        public /* synthetic */ C78635d(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$f */
    public static final class C78637f implements AbstractC76018b {
        static {
            Covode.recordClassIndex(91777);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76018b
        /* renamed from: a */
        public final void mo119718a(String str) {
            C89219l.m154721d(str, "");
        }

        C78637f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$g */
    public static final class C78638g implements AbstractC75615a {
        static {
            Covode.recordClassIndex(91778);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75615a
        /* renamed from: a */
        public final void mo118957a(Effect effect, String str, String str2, String str3) {
            C89219l.m154721d(effect, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75615a
        /* renamed from: b */
        public final void mo118958b(Effect effect, String str, String str2, String str3) {
            C89219l.m154721d(effect, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
        }

        C78638g() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$j */
    public static final class C78642j implements AbstractC75997b {
        static {
            Covode.recordClassIndex(91782);
        }

        C78642j() {
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.AbstractC75997b
        /* renamed from: a */
        public final Bundle mo119697a() {
            Bundle bundle = new Bundle();
            bundle.putInt("key_choose_scene", 3);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("upload_photo_min_height", 480);
            bundle.putInt("upload_photo_min_width", 360);
            bundle.putInt("key_support_flag", 1);
            return bundle;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.AbstractC75997b
        /* renamed from: a */
        public final List<C75938j> mo119698a(Intent intent) {
            C89219l.m154721d(intent, "");
            ArrayList<MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) parcelableArrayListExtra, 10));
            for (MediaModel mediaModel : parcelableArrayListExtra) {
                C89219l.m154716b(mediaModel, "");
                String str = mediaModel.f134662b;
                C89219l.m154716b(str, "");
                arrayList.add(new C75938j(str, mediaModel.f134668h, 0, null, null, null, 60));
            }
            return arrayList;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75578a
    /* renamed from: a */
    public final AbstractC75586c mo23179a() {
        return this.f176703v;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: t */
    public final AbstractC75655o mo23167t() {
        return this.f176690h;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: u */
    public final AbstractC75300d mo23168u() {
        return this.f176691i;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$e */
    static final class C78636e extends AbstractC89220m implements AbstractC89171a<AbstractC75701h> {

        /* renamed from: a */
        final /* synthetic */ C78629d f176710a;

        static {
            Covode.recordClassIndex(91776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78636e(C78629d dVar) {
            super(0);
            this.f176710a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC75701h invoke() {
            return this.f176710a.f176690h.mo119291c().mo119460f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$l */
    public static final class C78644l implements AbstractC75403e {

        /* renamed from: a */
        final /* synthetic */ C78629d f176716a;

        static {
            Covode.recordClassIndex(91784);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75403e
        /* renamed from: a */
        public final void mo118948a() {
            AbstractC14177d d = this.f176716a.mo122531d();
            if (d != null) {
                d.mo22742b(false, (PrivacyCert) null);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75403e
        /* renamed from: b */
        public final void mo118949b() {
            AbstractC14177d d = this.f176716a.mo122531d();
            if (d != null) {
                d.mo22740a(false, (PrivacyCert) null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78644l(C78629d dVar) {
            this.f176716a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$m */
    static final class C78645m extends AbstractC89220m implements AbstractC89171a<AbstractC14177d> {

        /* renamed from: a */
        final /* synthetic */ C78629d f176717a;

        static {
            Covode.recordClassIndex(91785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78645m(C78629d dVar) {
            super(0);
            this.f176717a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC14177d invoke() {
            C21582f b = C2552c.m7463b(this.f176717a.f176700r);
            if (b != null) {
                return b.mo35249a((Type) AbstractC14177d.class, (String) null);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$n */
    static final class C78646n extends AbstractC89220m implements AbstractC89171a<AbstractC46415f> {

        /* renamed from: a */
        final /* synthetic */ C78629d f176718a;

        static {
            Covode.recordClassIndex(91786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78646n(C78629d dVar) {
            super(0);
            this.f176718a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC46415f invoke() {
            Context applicationContext = this.f176718a.f176700r.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            return C46404c.m89554a(applicationContext, null);
        }
    }

    /* renamed from: f */
    public final void mo122533f() {
        this.f176690h.mo119303o();
        this.f176704w.mo142944a();
        if (this.f176689a.isInitialized()) {
            this.f176689a.getValue().mo78919d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$s */
    static final class C78651s extends AbstractC89220m implements AbstractC89171a<C75574j> {

        /* renamed from: a */
        public static final C78651s f176726a = new C78651s();

        static {
            Covode.recordClassIndex(91791);
        }

        C78651s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75574j invoke() {
            C75574j jVar = new C75574j(R.drawable.bn2, R.drawable.u8, null, R.color.a3, 0, 0, false, 0, false, null, null, false, false, false, 131036);
            int i = jVar.f169839a;
            int i2 = jVar.f169840b;
            C75520e eVar = jVar.f169841c;
            int i3 = jVar.f169842d;
            int i4 = jVar.f169843e;
            int i5 = jVar.f169844f;
            int i6 = jVar.f169845g;
            int i7 = jVar.f169846h;
            boolean z = jVar.f169847i;
            long j = jVar.f169848j;
            C75522g gVar = jVar.f169850l;
            C75572h hVar = jVar.f169851m;
            boolean z2 = jVar.f169852n;
            boolean z3 = jVar.f169853o;
            boolean z4 = jVar.f169854p;
            boolean z5 = jVar.f169855q;
            C89219l.m154721d(gVar, "");
            C89219l.m154721d(hVar, "");
            return new C75574j(i, i2, eVar, i3, i4, i5, i6, i7, z, j, false, gVar, hVar, z2, z3, z4, z5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$a */
    public static final class C78632a extends AbstractC21603p<AbstractC76115b<?, ?>> {

        /* renamed from: a */
        final /* synthetic */ C78629d f176708a;

        static {
            Covode.recordClassIndex(91772);
        }

        public C78632a(C78629d dVar) {
            this.f176708a = dVar;
        }

        @Override // com.bytedance.p1559o.AbstractC21603p
        public final AbstractC76115b<?, ?> get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C76177c cVar = new C76177c((byte) 0);
            cVar.mo119931a("sticker_category:favorite", new C76245b(this.f176708a.f176700r, (AbstractC75361b) fVar.mo35248a(AbstractC75361b.class, (String) null), this.f176708a.f176690h, (StickerPreferences) fVar.mo35248a(StickerPreferences.class, (String) null)));
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$b */
    public static final class C78633b extends AbstractC21603p<StickerPreferences> {

        /* renamed from: a */
        final /* synthetic */ C78629d f176709a;

        static {
            Covode.recordClassIndex(91773);
        }

        public C78633b(C78629d dVar) {
            this.f176709a = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.bytedance.p1559o.AbstractC21603p
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences get(com.bytedance.p1559o.C21582f r5) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
                com.bytedance.cukaie.closet.a r2 = new com.bytedance.cukaie.closet.a
                com.bytedance.cukaie.closet.internal.d r0 = new com.bytedance.cukaie.closet.internal.d
                r0.<init>()
                r2.<init>(r0)
                com.ss.android.ugc.aweme.tools.live.sticker.d r0 = r4.f176709a
                androidx.appcompat.app.d r0 = r0.f176700r
                android.content.Context r1 = r0.getApplicationContext()
                boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
                if (r0 != 0) goto L_0x0025
            L_0x001b:
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
                java.lang.Class<com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences> r0 = com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences.class
                java.lang.Object r0 = r2.mo23215a(r1, r0)
                return r0
            L_0x0025:
                if (r1 == 0) goto L_0x0028
                goto L_0x001b
            L_0x0028:
                android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.live.sticker.C78629d.C78633b.get(com.bytedance.o.f):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo122530a(AbstractC75413a aVar) {
        this.f176693k = aVar;
        this.f176698p.f176687a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$c */
    public static final class C78634c extends AbstractC21603p<AbstractC75361b> {
        static {
            Covode.recordClassIndex(91774);
        }

        @Override // com.bytedance.p1559o.AbstractC21603p
        public final AbstractC75361b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C75363c(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$p */
    public static final class C78648p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ IStickerViewService.AbstractC75242a f176722a;

        static {
            Covode.recordClassIndex(91788);
        }

        C78648p(IStickerViewService.AbstractC75242a aVar) {
            this.f176722a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            IStickerViewService.AbstractC75242a aVar;
            StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) obj;
            if (stickerTagChangeData != null && (aVar = this.f176722a) != null) {
                String tabName = stickerTagChangeData.getTabName();
                stickerTagChangeData.getTabKey();
                aVar.mo96115a(tabName);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$q */
    public static final class C78649q implements AbstractC75301e {

        /* renamed from: a */
        final /* synthetic */ C78629d f176723a;

        /* renamed from: b */
        final /* synthetic */ IStickerViewService.AbstractC75242a f176724b;

        static {
            Covode.recordClassIndex(91789);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
        /* renamed from: a */
        public final void mo87551a(C75618a aVar) {
            boolean z;
            C89219l.m154721d(aVar, "");
            this.f176723a.f176695m = aVar.f170022a;
            IStickerService.FaceSticker a = C75345d.m132152a(aVar.f170022a);
            if (a != null) {
                Bundle bundle = aVar.f170026e;
                if (bundle != null) {
                    z = bundle.getBoolean("is_video_used_sticker");
                } else {
                    z = false;
                }
                a.isVideoUsedSticker = z;
                IStickerViewService.AbstractC75242a aVar2 = this.f176724b;
                if (aVar2 != null) {
                    aVar2.mo96114a(a);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
        /* renamed from: a */
        public final void mo87552a(C75621d dVar) {
            boolean z;
            C89219l.m154721d(dVar, "");
            IStickerService.FaceSticker faceSticker = null;
            this.f176723a.f176695m = null;
            IStickerViewService.AbstractC75242a aVar = this.f176724b;
            if (aVar != null) {
                IStickerService.FaceSticker a = C75345d.m132152a(dVar.f170028a);
                if (a != null) {
                    Bundle bundle = dVar.f170032e;
                    if (bundle != null) {
                        z = bundle.getBoolean("is_video_used_sticker");
                    } else {
                        z = false;
                    }
                    a.isVideoUsedSticker = z;
                    faceSticker = a;
                }
                aVar.mo96117b(faceSticker);
            }
        }

        C78649q(C78629d dVar, IStickerViewService.AbstractC75242a aVar) {
            this.f176723a = dVar;
            this.f176724b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$o */
    public static final class C78647o implements AbstractC75576l {

        /* renamed from: a */
        final /* synthetic */ C78629d f176719a;

        /* renamed from: b */
        final /* synthetic */ IStickerViewService.AbstractC75242a f176720b;

        /* renamed from: c */
        private final AbstractC84919c f176721c;

        static {
            Covode.recordClassIndex(91787);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: a */
        public final void mo23175a(View view) {
            C89219l.m154721d(view, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        public final void cD_() {
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: b */
        public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
            AbstractC84919c cVar;
            C89219l.m154721d(aVar, "");
            if (aVar == AbstractC75576l.EnumC75577a.AFTER_ANIMATE) {
                IStickerViewService.AbstractC75242a aVar2 = this.f176720b;
                if (aVar2 != null) {
                    C75345d.m132152a(this.f176719a.f176690h.mo119294f());
                    aVar2.mo96116b();
                }
                if (C89219l.m154714a((Object) "livestreaming", (Object) this.f176719a.f176701s)) {
                    String name = this.f176719a.f176700r.getClass().getName();
                    C89219l.m154716b(name, "");
                    if (C89361p.m154908a((CharSequence) name, (CharSequence) "VideoRecordNewActivity", false) && (cVar = this.f176721c) != null) {
                        cVar.mo87535c(this.f176719a.f176692j);
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: a */
        public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
            AbstractC84919c cVar;
            IStickerService.FaceSticker a;
            IStickerViewService.AbstractC75242a aVar2;
            C89219l.m154721d(aVar, "");
            if (aVar == AbstractC75576l.EnumC75577a.BEFORE_ANIMATE) {
                if (this.f176719a.f176694l && this.f176719a.f176690h.mo119294f() != null && (!C89219l.m154714a(this.f176719a.f176690h.mo119294f(), this.f176719a.f176695m))) {
                    this.f176719a.f176694l = false;
                    C78629d dVar = this.f176719a;
                    dVar.f176695m = dVar.f176690h.mo119294f();
                    Effect f = this.f176719a.f176690h.mo119294f();
                    if (!(f == null || (a = C75345d.m132152a(f)) == null || (aVar2 = this.f176720b) == null)) {
                        aVar2.mo96114a(a);
                    }
                }
                IStickerViewService.AbstractC75242a aVar3 = this.f176720b;
                if (aVar3 != null) {
                    C75345d.m132152a(this.f176719a.f176690h.mo119294f());
                    aVar3.mo96113a();
                }
                if (C89219l.m154714a((Object) "livestreaming", (Object) this.f176719a.f176701s)) {
                    String name = this.f176719a.f176700r.getClass().getName();
                    C89219l.m154716b(name, "");
                    if (C89361p.m154908a((CharSequence) name, (CharSequence) "VideoRecordNewActivity", false) && (cVar = this.f176721c) != null) {
                        cVar.mo87533b(this.f176719a.f176692j);
                    }
                }
            }
        }

        C78647o(C78629d dVar, IStickerViewService.AbstractC75242a aVar) {
            this.f176719a = dVar;
            this.f176720b = aVar;
            this.f176721c = C63244g.m114602a().mo73259E().mo93884a((Activity) dVar.f176700r);
        }
    }

    /* renamed from: a */
    public final void mo122529a(AbstractC27255q<AbstractC75448a> qVar) {
        C89219l.m154721d(qVar, "");
        mo23157a(new UploadPicStickerARPresenter(this.f176700r, null, new C33475b(), new C78637f(), new C78638g(), new C78642j(), null, null, C78643k.f176715a, null, new C78639h(qVar), C78641i.f176714a, null, this.f176690h.mo119291c().mo119464j().mo119472d(), this.f176690h, new C78644l(this), null, null, null, 1838786));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$i */
    public static final class C78641i extends AbstractC89220m implements AbstractC89183m<String, C75938j, C89391z> {

        /* renamed from: a */
        public static final C78641i f176714a = new C78641i();

        static {
            Covode.recordClassIndex(91781);
        }

        C78641i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, C75938j jVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(jVar, "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$h */
    public static final class C78639h extends AbstractC89220m implements AbstractC89183m<String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC27255q f176711a;

        static {
            Covode.recordClassIndex(91779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78639h(AbstractC27255q qVar) {
            super(2);
            this.f176711a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, String str2) {
            final String str3 = str;
            String str4 = str2;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C36081b.m73539a(str4, C36081b.f85246a, new AbstractC89172b<String, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.live.sticker.C78629d.C78639h.C786401 */

                /* renamed from: a */
                final /* synthetic */ C78639h f176712a;

                static {
                    Covode.recordClassIndex(91780);
                }

                {
                    this.f176712a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(String str) {
                    String str2 = str;
                    C89219l.m154721d(str2, "");
                    ((AbstractC75448a) this.f176712a.f176711a.mo5560b()).mo96112a(str3, str2);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$r */
    static final class C78650r implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C78629d f176725a;

        static {
            Covode.recordClassIndex(91790);
        }

        C78650r(C78629d dVar) {
            this.f176725a = dVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            AbstractC75573i iVar;
            if (i != 4 || (iVar = this.f176725a.f169899f) == null || !iVar.mo119140d()) {
                return false;
            }
            AbstractC75573i iVar2 = this.f176725a.f169899f;
            if (iVar2 != null) {
                iVar2.mo119143g();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$k */
    public static final class C78643k extends AbstractC89220m implements AbstractC89183m<Long, String, C89391z> {

        /* renamed from: a */
        public static final C78643k f176715a = new C78643k();

        static {
            Covode.recordClassIndex(91783);
        }

        C78643k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Long l, String str) {
            long longValue = l.longValue();
            C63244g.m114602a().mo73263I().mo101629a("upload_pic_sticker_loading_time", 0, new C69840ar().mo110188a("duration", Long.valueOf(longValue)).mo110189a("stickid", str).mo110191a());
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78629d(ActivityC0218d dVar, String str) {
        super(dVar, C80249bj.f179731a);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(str, "");
        this.f176700r = dVar;
        this.f176701s = str;
        AbstractC89244h<AbstractC46415f> a = C89250i.m154773a((AbstractC89171a) new C78646n(this));
        this.f176689a = a;
        AbstractC75655o a2 = C75404l.m132237a(this.f176700r, new C75657q("livestreaming", false, true), C75449o.f169546a, a.getValue()).mo119314a();
        this.f176690h = a2;
        this.f176703v = C75585b.f169915a;
        C75281a aVar = new C75281a(a2);
        this.f176691i = aVar;
        this.f176692j = new C78650r(this);
        this.f176694l = true;
        this.f176704w = new C88411a();
        C78628c cVar = new C78628c((byte) 0);
        this.f176698p = cVar;
        C21597n nVar = new C21597n();
        C89219l.m154716b(nVar.mo35260a(AbstractC75361b.class, (String) null, (AbstractC21603p) new C78634c()), "");
        C89219l.m154716b(nVar.mo35260a(AbstractC76115b.class, (String) null, (AbstractC21603p) new C78632a(this)), "");
        C89219l.m154716b(nVar.mo35260a(StickerPreferences.class, (String) null, (AbstractC21603p) new C78633b(this)), "");
        C21582f a3 = nVar.mo35258a();
        C89219l.m154716b(a3, "");
        this.f176699q = a3;
        this.f176705x = C89250i.m154773a((AbstractC89171a) C78651s.f176726a);
        C75858a aVar2 = new C75858a(C89250i.m154773a((AbstractC89171a) new C78636e(this)));
        AbstractC75704j i = a2.mo119291c().mo119463i();
        Context applicationContext = this.f176700r.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        i.mo119431a(new C75855a(aVar2, applicationContext, (byte) 0));
        mo23157a(new C78627b(this.f176700r, a2, cVar, (AbstractC75361b) a3.mo35248a(AbstractC75361b.class, (String) null), (StickerPreferences) a3.mo35248a(StickerPreferences.class, (String) null), new AbstractC89171a<C75574j>(this) {
            /* class com.p2082ss.android.ugc.aweme.tools.live.sticker.C78629d.C786301 */

            /* renamed from: a */
            final /* synthetic */ C78629d f176706a;

            static {
                Covode.recordClassIndex(91770);
            }

            {
                this.f176706a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C75574j invoke() {
                return this.f176706a.mo122532e();
            }
        }));
        aVar.mo118612a(new AbstractC75292d(this) {
            /* class com.p2082ss.android.ugc.aweme.tools.live.sticker.C78629d.C786312 */

            /* renamed from: a */
            final /* synthetic */ C78629d f176707a;

            static {
                Covode.recordClassIndex(91771);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f176707a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.AbstractC75292d
            /* renamed from: a */
            public final <T> boolean mo118624a(AbstractC75296b<T> bVar) {
                LiveData<StickerTagChangeData> a;
                StickerTagChangeData value;
                String tabName;
                String str = "";
                C89219l.m154721d(bVar, str);
                if (!(bVar instanceof C75297c)) {
                    return false;
                }
                Effect effect = ((C75297c) bVar).f169280a;
                C78628c cVar = this.f176707a.f176698p;
                boolean a2 = C75344c.m132147a(this.f176707a.f176690h, effect);
                AbstractC75573i iVar = this.f176707a.f169899f;
                if (!(iVar == null || (a = iVar.mo119129a()) == null || (value = a.getValue()) == null || (tabName = value.getTabName()) == null)) {
                    str = tabName;
                }
                cVar.mo118954a(effect, a2, str, "click_main_panel", bVar.mo118630a(), false, null);
                return false;
            }
        });
        mo119308c();
    }
}
