package com.bytedance.creativex.recorder.sticker.p948b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14196o;
import com.bytedance.creativex.recorder.p940b.p941a.C14200s;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14331b;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14334d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.ugc.asve.p2214c.AbstractC31030a;
import com.p2082ss.android.ugc.asve.p2214c.C31031b;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.favorite.C75366d;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.C75281a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.C75373b;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75426e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75464f;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75550j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75578a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75594h;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75589c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75657q;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75632l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75635n;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a.AbstractC75586c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a.C75583a;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.C75855a;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.p3996a.C75858a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75738i;
import com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.creativex.recorder.sticker.b.f */
public abstract class AbstractC14343f<API extends AbstractC14330a> extends AbstractC2562j<API> implements AbstractC14330a, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f34717a = {new C89232y(AbstractC14343f.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(AbstractC14343f.class, "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/tools/effectplatform/api/IEffectPlatformPrimitive;", 0)};

    /* renamed from: A */
    private final AbstractC89248d f34718A;

    /* renamed from: B */
    private final AbstractC89244h f34719B;

    /* renamed from: C */
    private final AbstractC89244h f34720C;

    /* renamed from: D */
    private final AbstractC89244h f34721D;

    /* renamed from: E */
    private final C14367t f34722E;

    /* renamed from: F */
    private final C21582f f34723F;

    /* renamed from: b */
    public final ActivityC0218d f34724b;

    /* renamed from: c */
    public final AbstractC75429h f34725c;

    /* renamed from: d */
    public final AbstractC14177d f34726d;

    /* renamed from: e */
    public final ASCameraView f34727e;

    /* renamed from: f */
    final AbstractC89248d f34728f;

    /* renamed from: g */
    public final C14344a f34729g;

    /* renamed from: h */
    public final C88411a f34730h;

    /* renamed from: i */
    public final C14350g f34731i;

    /* renamed from: j */
    public final C2560h<Boolean> f34732j;

    /* renamed from: k */
    public final C14336b f34733k;

    /* renamed from: l */
    public final C14337c f34734l;

    /* renamed from: m */
    public C75635n f34735m;

    /* renamed from: n */
    public final MessageCenter.Listener f34736n;

    /* renamed from: o */
    public final C2563k<Boolean> f34737o;

    /* renamed from: p */
    public final C2563k<Boolean> f34738p;

    /* renamed from: q */
    public final C2563k<AbstractC14331b> f34739q;

    /* renamed from: r */
    public final C2563k<Boolean> f34740r;

    /* renamed from: s */
    public final C14338d f34741s;

    /* renamed from: t */
    public final C2563k<Boolean> f34742t;

    /* renamed from: u */
    public final C2563k<Effect> f34743u;

    /* renamed from: v */
    public final C2563k<Boolean> f34744v;

    /* renamed from: w */
    public final C2563k<C89391z> f34745w;

    /* renamed from: x */
    public final C2563k<AbstractC75620c> f34746x;

    /* renamed from: y */
    final C88960c<C89378p<Effect, C14335a>> f34747y;

    /* renamed from: z */
    public List<String> f34748z;

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$i */
    static final class C14354i<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        public static final C14354i f34774a = new C14354i();

        static {
            Covode.recordClassIndex(16427);
        }

        C14354i() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
        }
    }

    static {
        Covode.recordClassIndex(16416);
    }

    /* renamed from: a */
    public void mo23159a(AbstractC75655o oVar, AbstractC75300d dVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23160a(AbstractC75711q.AbstractC75712a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: h */
    public final AbstractC75586c mo23126h() {
        return (AbstractC75586c) this.f34721D.getValue();
    }

    /* renamed from: q */
    public final AbstractC14193m mo23164q() {
        return (AbstractC14193m) this.f34718A.mo23374a(this, f34717a[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: t */
    public final AbstractC75655o mo23167t() {
        return (AbstractC75655o) this.f34719B.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: u */
    public AbstractC75300d mo23168u() {
        return (AbstractC75300d) this.f34720C.getValue();
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2559g mo23116a() {
        return this.f34737o;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2559g mo23119b() {
        return this.f34739q;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC14334d mo23121c() {
        return this.f34741s;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2559g mo23122d() {
        return this.f34742t;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2559g mo23123e() {
        return this.f34740r;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2559g mo23124f() {
        return this.f34746x;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f34723F;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C2559g mo23128j() {
        return this.f34743u;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C2559g mo23129k() {
        return this.f34744v;
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$g */
    public static final class C14350g extends AbstractC75578a {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34765a;

        static {
            Covode.recordClassIndex(16423);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75578a
        /* renamed from: a */
        public final AbstractC75586c mo23179a() {
            return this.f34765a.mo23126h();
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75578a
        /* renamed from: b */
        public final C75635n mo23180b() {
            return this.f34765a.f34735m;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
        /* renamed from: t */
        public final AbstractC75655o mo23167t() {
            return this.f34765a.mo23167t();
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
        /* renamed from: u */
        public final AbstractC75300d mo23168u() {
            return this.f34765a.mo23168u();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14350g(AbstractC14343f fVar, AbstractC1204m mVar, AbstractC84903j jVar) {
            super(mVar, jVar);
            this.f34765a = fVar;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: i */
    public final FaceStickerBean mo23127i() {
        return mo23170w();
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: o */
    public final void mo23133o() {
        this.f34733k.mo23147b();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onStart() {
        super.onStart();
        mo23163d(true);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onStop() {
        super.onStop();
        mo23163d(false);
    }

    /* renamed from: r */
    public final CameraComponentModel mo23165r() {
        return this.f34726d.mo22803b();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: v */
    public final AbstractC75573i mo23169v() {
        return this.f34731i.f169899f;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: x */
    public final SafeHandler mo23171x() {
        return this.f34731i.f169900g;
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$a */
    public static final class C14344a {

        /* renamed from: a */
        public boolean f34749a;

        /* renamed from: b */
        public AbstractC89171a<Boolean> f34750b;

        /* renamed from: c */
        public AbstractC89172b<? super String, String> f34751c;

        /* renamed from: d */
        public AbstractC84903j f34752d;

        /* renamed from: e */
        public AbstractC89172b<? super Effect, C89391z> f34753e;

        /* renamed from: f */
        public C75657q f34754f;

        /* renamed from: g */
        public AbstractC89171a<? extends AbstractC75594h> f34755g;

        /* renamed from: h */
        public Handler f34756h;

        /* renamed from: i */
        public boolean f34757i;

        /* renamed from: j */
        public AbstractC31030a f34758j;

        static {
            Covode.recordClassIndex(16417);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14344a)) {
                return false;
            }
            C14344a aVar = (C14344a) obj;
            return this.f34749a == aVar.f34749a && C89219l.m154714a(this.f34750b, aVar.f34750b) && C89219l.m154714a(this.f34751c, aVar.f34751c) && C89219l.m154714a(this.f34752d, aVar.f34752d) && C89219l.m154714a(this.f34753e, aVar.f34753e) && C89219l.m154714a(this.f34754f, aVar.f34754f) && C89219l.m154714a(this.f34755g, aVar.f34755g) && C89219l.m154714a(this.f34756h, aVar.f34756h) && this.f34757i == aVar.f34757i && C89219l.m154714a(this.f34758j, aVar.f34758j);
        }

        public final int hashCode() {
            boolean z = this.f34749a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            AbstractC89171a<Boolean> aVar = this.f34750b;
            int i6 = 0;
            int hashCode = (i5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            AbstractC89172b<? super String, String> bVar = this.f34751c;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            AbstractC84903j jVar = this.f34752d;
            int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            AbstractC89172b<? super Effect, C89391z> bVar2 = this.f34753e;
            int hashCode4 = (hashCode3 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
            C75657q qVar = this.f34754f;
            int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
            AbstractC89171a<? extends AbstractC75594h> aVar2 = this.f34755g;
            int hashCode6 = (hashCode5 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            Handler handler = this.f34756h;
            int hashCode7 = (hashCode6 + (handler != null ? handler.hashCode() : 0)) * 31;
            if (!this.f34757i) {
                i = 0;
            }
            int i7 = (hashCode7 + i) * 31;
            AbstractC31030a aVar3 = this.f34758j;
            if (aVar3 != null) {
                i6 = aVar3.hashCode();
            }
            return i7 + i6;
        }

        public final String toString() {
            return "Config(showToolViewRemoteImage=" + this.f34749a + ", autoShowPanelInterceptor=" + this.f34750b + ", beatMusicPathGenerator=" + this.f34751c + ", toolsLogger=" + this.f34752d + ", onFavoriteChanged=" + this.f34753e + ", stickerManagerConfigure=" + this.f34754f + ", stickerDataManagerFactory=" + this.f34755g + ", sensorHandler=" + this.f34756h + ", unRegisteredSensorWhenCancelSticker=" + this.f34757i + ", privacyCertConfiguration=" + this.f34758j + ")";
        }

        public /* synthetic */ C14344a() {
            this(new C75657q("default"), C31031b.f74363m);
        }

        private C14344a(C75657q qVar, AbstractC31030a aVar) {
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(aVar, "");
            this.f34749a = true;
            this.f34750b = null;
            this.f34751c = null;
            this.f34752d = null;
            this.f34753e = null;
            this.f34754f = qVar;
            this.f34755g = null;
            this.f34756h = null;
            this.f34757i = false;
            this.f34758j = aVar;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$c */
    static final class C14346c extends AbstractC89220m implements AbstractC89171a<C75574j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34760a;

        static {
            Covode.recordClassIndex(16419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14346c(AbstractC14343f fVar) {
            super(0);
            this.f34760a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75574j invoke() {
            AbstractC75573i iVar = this.f34760a.f34731i.f169899f;
            if (iVar != null) {
                return iVar.mo119167m();
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$d */
    static final class C14347d extends AbstractC89220m implements AbstractC89171a<AbstractC75701h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34761a;

        static {
            Covode.recordClassIndex(16420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14347d(AbstractC14343f fVar) {
            super(0);
            this.f34761a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC75701h invoke() {
            return this.f34761a.mo23167t().mo119291c().mo119460f();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$r */
    static final class C14365r extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34788a;

        static {
            Covode.recordClassIndex(16438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14365r(AbstractC14343f fVar) {
            super(0);
            this.f34788a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C75466g.m132359k(C75346e.m132154a(this.f34788a)));
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$u */
    static final class C14368u extends AbstractC89220m implements AbstractC89171a<C75583a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34791a;

        static {
            Covode.recordClassIndex(16441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14368u(AbstractC14343f fVar) {
            super(0);
            this.f34791a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75583a invoke() {
            return new C75583a(new AbstractC89189s<Integer, Integer, String, Effect, Boolean, Integer>(this) {
                /* class com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f.C14368u.C143691 */

                /* renamed from: a */
                final /* synthetic */ C14368u f34792a;

                static {
                    Covode.recordClassIndex(16442);
                }

                {
                    this.f34792a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89189s
                public final /* synthetic */ Integer invoke(Integer num, Integer num2, String str, Effect effect, Boolean bool) {
                    String extra;
                    int intValue = num.intValue();
                    int intValue2 = num2.intValue();
                    String str2 = str;
                    Effect effect2 = effect;
                    boolean booleanValue = bool.booleanValue();
                    String str3 = "";
                    C89219l.m154721d(str2, str3);
                    AbstractC31193a effectController = this.f34792a.f34791a.f34727e.getEffectController();
                    VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
                    vEEffectFilterParam.effectPath = str2;
                    vEEffectFilterParam.stickerId = intValue2;
                    vEEffectFilterParam.reqId = intValue;
                    if (!(effect2 == null || (extra = effect2.getExtra()) == null)) {
                        str3 = extra;
                    }
                    vEEffectFilterParam.stickerTag = str3;
                    vEEffectFilterParam.needReload = booleanValue;
                    if (C75466g.m132367s(effect2)) {
                        vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EnumC85493a.MUSIC;
                    }
                    if (C75466g.m132355g(effect2)) {
                        vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EnumC85493a.AUDIO_SPEED;
                    }
                    return Integer.valueOf(effectController.mo56755a(vEEffectFilterParam));
                }
            });
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$w */
    static final class C14371w extends AbstractC89220m implements AbstractC89171a<C75281a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34794a;

        static {
            Covode.recordClassIndex(16444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14371w(AbstractC14343f fVar) {
            super(0);
            this.f34794a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75281a invoke() {
            return new C75281a(this.f34794a.mo23167t());
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: g */
    public final AbstractC88979t<C89378p<Effect, C14335a>> mo23125g() {
        AbstractC88979t<C89378p<Effect, C14335a>> c = this.f34747y.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: l */
    public final void mo23130l() {
        this.f34727e.getEffectController().mo56811d((String) null);
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: n */
    public final void mo23132n() {
        this.f34726d.mo22816f().mo7036a(this.f34724b, C14354i.f34774a);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onDestroy() {
        super.onDestroy();
        this.f34730h.mo142944a();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onPause() {
        super.onPause();
        this.f34733k.mo23147b();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onResume() {
        super.onResume();
        this.f34733k.mo23145a();
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: p */
    public final void mo23134p() {
        this.f34727e.getEffectController().mo56799b(this.f34736n);
    }

    /* renamed from: s */
    public final Effect mo23166s() {
        return mo23167t().mo119295g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public FaceStickerBean mo23170w() {
        return C75464f.m132333a(mo23166s());
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$p */
    static final class C14363p extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34786a;

        static {
            Covode.recordClassIndex(16436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14363p(AbstractC14343f fVar) {
            super(0);
            this.f34786a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!C75466g.m132357i(this.f34786a.mo23167t().mo119302n().mo119323b().getValue()));
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$x */
    static final class RunnableC14372x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34795a;

        static {
            Covode.recordClassIndex(16445);
        }

        RunnableC14372x(AbstractC14343f fVar) {
            this.f34795a = fVar;
        }

        public final void run() {
            this.f34795a.f34726d.mo22747A().mo56908a(new RecordInvoker.OnARTextContentCallback(this) {
                /* class com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f.RunnableC14372x.C143731 */

                /* renamed from: a */
                final /* synthetic */ RunnableC14372x f34796a;

                static {
                    Covode.recordClassIndex(16446);
                }

                {
                    this.f34796a = r1;
                }

                @Override // com.p2082ss.android.medialib.RecordInvoker.OnARTextContentCallback
                public final void onResult(String[] strArr) {
                    ArrayList arrayList;
                    AbstractC14343f fVar = this.f34796a.f34795a;
                    if (strArr == null || strArr.length == 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(C89064i.m154508i(strArr));
                    }
                    fVar.f34748z = arrayList;
                }
            });
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: m */
    public final void mo23131m() {
        AbstractC75718w c = mo23167t().mo119291c();
        AbstractC75720y j = c.mo119464j();
        j.mo119469b().observe(this.f34724b, new C14351h(this, j, c));
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$s */
    static final class C14366s extends AbstractC89220m implements AbstractC89171a<AbstractC75655o> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34789a;

        static {
            Covode.recordClassIndex(16439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14366s(AbstractC14343f fVar) {
            super(0);
            this.f34789a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC75655o invoke() {
            AbstractC75594h hVar;
            AbstractC89171a<? extends AbstractC75594h> aVar = this.f34789a.f34729g.f34755g;
            if (aVar == null || (hVar = (AbstractC75594h) aVar.invoke()) == null) {
                ActivityC0218d dVar = this.f34789a.f34724b;
                C75657q qVar = this.f34789a.f34729g.f34754f;
                C75373b bVar = C75373b.f169421a;
                AbstractC14343f fVar = this.f34789a;
                hVar = new C75589c(dVar, qVar, bVar, (AbstractC84398d) fVar.f34728f.mo23374a(fVar, AbstractC14343f.f34717a[1]));
            }
            return hVar.mo119314a();
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        mo23167t();
        this.f34732j.mo7036a(this.f34724b, new C14355j(this));
        if (this.f34729g.f34754f.f170072d) {
            AbstractC75704j i = mo23167t().mo119291c().mo119463i();
            C75858a aVar = new C75858a(C89250i.m154773a((AbstractC89171a) new C14347d(this)));
            Context applicationContext = this.f34724b.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            i.mo119431a(new C75855a(aVar, applicationContext));
            mo23157a(new C75366d(this.f34724b, (AbstractC75361b) getDiContainer().mo35248a(AbstractC75361b.class, (String) null), mo23167t(), this.f34725c, (StickerPreferences) getDiContainer().mo35248a(StickerPreferences.class, (String) null), new C14345b(this), new C14346c(this)));
        }
        mo23164q().mo22904k().mo6997a(this, new C14356k(this));
        mo23164q().mo22902i().mo6997a(this, new C14357l(this));
        mo23164q().mo22905l().mo6997a(this, new C14358m(this));
        mo23164q().mo22906m().mo6997a(this, new C14359n(this));
        mo23164q().mo22870F().mo6997a(this, new C14362o(this));
        mo23164q().mo22881a(new C14363p(this));
        this.f34726d.mo22820h().mo6997a(this.f34724b, new C14364q(this));
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$f */
    public static final class C14349f implements AbstractC75576l {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34764a;

        static {
            Covode.recordClassIndex(16422);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: a */
        public final void mo23175a(View view) {
            C89219l.m154721d(view, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        public final void cD_() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14349f(AbstractC14343f fVar) {
            this.f34764a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: a */
        public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
            C89219l.m154721d(aVar, "");
            if (aVar == AbstractC75576l.EnumC75577a.BEFORE_ANIMATE) {
                this.f34764a.f34742t.mo6999a((Boolean) true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: b */
        public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
            C89219l.m154721d(aVar, "");
            if (aVar == AbstractC75576l.EnumC75577a.AFTER_ANIMATE) {
                this.f34764a.f34742t.mo6999a((Boolean) false);
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$q */
    static final class C14364q<T> implements AbstractC2565m<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34787a;

        static {
            Covode.recordClassIndex(16437);
        }

        C14364q(AbstractC14343f fVar) {
            this.f34787a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C89391z zVar) {
            this.f34787a.mo23163d(true);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$t */
    public static final class C14367t implements AbstractC75633m {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34790a;

        static {
            Covode.recordClassIndex(16440);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14367t(AbstractC14343f fVar) {
            this.f34790a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
        /* renamed from: a */
        public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
            AbstractC89171a<Boolean> aVar2;
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(aVar, "");
            C75619b a = aVar.mo119345a(cVar);
            if (cVar instanceof C75618a) {
                C75618a aVar3 = (C75618a) cVar;
                if (aVar3.f170024c == EnumC75295a.MANUAL_SET && !this.f34790a.mo23167t().mo119290b() && (((aVar2 = this.f34790a.f34729g.f34750b) == null || !aVar2.invoke().booleanValue()) && C75466g.m132337A(aVar3.f170022a))) {
                    if (this.f34790a.mo23167t().mo119288a()) {
                        this.f34790a.f34738p.mo6999a((Boolean) true);
                    } else {
                        this.f34790a.mo23162c(true);
                    }
                }
            }
            this.f34790a.f34746x.mo6999a(cVar);
            this.f34790a.mo23118a(false);
            return a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$k */
    static final class C14356k<T> implements AbstractC2565m<C14207x> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34776a;

        static {
            Covode.recordClassIndex(16429);
        }

        C14356k(AbstractC14343f fVar) {
            this.f34776a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14207x xVar) {
            this.f34776a.f34740r.mo6999a((Boolean) true);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$o */
    static final class C14362o<T> implements AbstractC2565m<C14196o> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34785a;

        static {
            Covode.recordClassIndex(16435);
        }

        C14362o(AbstractC14343f fVar) {
            this.f34785a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14196o oVar) {
            C14339e.m26184b((AbstractC75649i) this.f34785a.getApiComponent());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: a */
    public final AbstractC75633m mo23154a(AbstractC89172b<? super AbstractC75633m, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        return this.f34731i.mo23154a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: b */
    public final void mo23161b(AbstractC75633m mVar) {
        C89219l.m154721d(mVar, "");
        this.f34731i.mo23161b(mVar);
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$b */
    static final class C14345b extends AbstractC89220m implements AbstractC89172b<Effect, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34759a;

        static {
            Covode.recordClassIndex(16418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14345b(AbstractC14343f fVar) {
            super(1);
            this.f34759a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Effect effect) {
            C89219l.m154721d(effect, "");
            AbstractC89172b<? super Effect, C89391z> bVar = this.f34759a.f34729g.f34753e;
            if (bVar != null) {
                bVar.invoke(effect);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$j */
    static final class C14355j<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34775a;

        static {
            Covode.recordClassIndex(16428);
        }

        C14355j(AbstractC14343f fVar) {
            this.f34775a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                C14336b bVar = this.f34775a.f34733k;
                boolean booleanValue = bool2.booleanValue();
                AbstractC75884a aVar = bVar.f34710a;
                if (aVar != null) {
                    aVar.mo119551a(booleanValue);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: a */
    public final void mo23156a(AbstractC75573i iVar) {
        C89219l.m154721d(iVar, "");
        this.f34731i.mo23156a(iVar);
        iVar.mo119134a(new C14349f(this));
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: b */
    public final void mo23120b(boolean z) {
        this.f34744v.mo7000b(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo23162c(boolean z) {
        this.f34725c.mo118950a().mo118972a("tool_performance_open_choose_sticker", "click_open_sticker");
        this.f34737o.mo6999a(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo23163d(boolean z) {
        if (z) {
            this.f34727e.getEffectController().mo56774a(this.f34736n);
        } else {
            this.f34727e.getEffectController().mo56799b(this.f34736n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$e */
    public static final class C14348e extends AbstractC89220m implements AbstractC89172b<Effect, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34762a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f34763b;

        static {
            Covode.recordClassIndex(16421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14348e(AbstractC14343f fVar, FrameLayout frameLayout) {
            super(1);
            this.f34762a = fVar;
            this.f34763b = frameLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Effect effect) {
            Effect effect2 = effect;
            C89219l.m154721d(effect2, "");
            Effect s = this.f34762a.mo23166s();
            if (s != null && (C75466g.m132345a(s) || (!TextUtils.isEmpty(s.getParentId()) && C89219l.m154714a((Object) s.getParentId(), (Object) effect2.getParentId())))) {
                this.f34762a.mo23126h().mo119309a();
            }
            this.f34762a.f34739q.mo6999a(new AbstractC14331b.C14332a(effect2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$h */
    public static final class C14351h implements AbstractC1214u<C35324a<PanelInfoModel>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34766a;

        /* renamed from: b */
        final /* synthetic */ AbstractC75720y f34767b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75718w f34768c;

        static {
            Covode.recordClassIndex(16424);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C35324a<PanelInfoModel> aVar) {
            M m;
            CategoryEffectModel categoryEffectModel;
            String categoryKey;
            C35324a<PanelInfoModel> aVar2 = aVar;
            if (aVar2 != null && (m = aVar2.f83350a) != null && (categoryEffectModel = m.getCategoryEffectModel()) != null && (categoryKey = categoryEffectModel.getCategoryKey()) != null && categoryKey.length() != 0 && categoryEffectModel != null) {
                this.f34767b.mo119469b().removeObserver(this);
                this.f34767b.mo119465a(categoryEffectModel.getCategoryKey(), true).observe(this.f34766a.f34724b, new C14352a(categoryEffectModel, this));
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$h$a */
        public static final class C14352a implements AbstractC1214u<C35324a<CategoryEffectModel>> {

            /* renamed from: a */
            final /* synthetic */ CategoryEffectModel f34769a;

            /* renamed from: b */
            final /* synthetic */ C14351h f34770b;

            static {
                Covode.recordClassIndex(16425);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r3 = r6.f83350a;
             */
            @Override // androidx.lifecycle.AbstractC1214u
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onChanged(com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a<com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel> r6) {
                /*
                // Method dump skipped, instructions count: 161
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f.C14351h.C14352a.onChanged(java.lang.Object):void");
            }

            C14352a(CategoryEffectModel categoryEffectModel, C14351h hVar) {
                this.f34769a = categoryEffectModel;
                this.f34770b = hVar;
            }
        }

        C14351h(AbstractC14343f fVar, AbstractC75720y yVar, AbstractC75718w wVar) {
            this.f34766a = fVar;
            this.f34767b = yVar;
            this.f34768c = wVar;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$m */
    static final class C14358m<T> implements AbstractC2565m<C14207x> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34778a;

        static {
            Covode.recordClassIndex(16431);
        }

        C14358m(AbstractC14343f fVar) {
            this.f34778a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14207x xVar) {
            List<String> list;
            List<String> list2;
            C14207x xVar2 = xVar;
            Effect value = this.f34778a.mo23167t().mo119302n().mo119323b().getValue();
            if (xVar2 != null) {
                xVar2.f34486b = value;
                SavePhotoStickerInfo savePhotoStickerInfo = null;
                if (C75466g.m132359k(value)) {
                    list = this.f34778a.f34748z;
                } else {
                    list = null;
                }
                if (C75466g.m132361m(value)) {
                    list2 = this.f34778a.f34748z;
                } else {
                    list2 = null;
                }
                if (C75466g.m132338B(value)) {
                    savePhotoStickerInfo = this.f34778a.f34726d.mo22795ac();
                }
                xVar2.f34488d = new C14200s(list, list2, savePhotoStickerInfo);
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$n */
    static final class C14359n<T> implements AbstractC2565m<C14207x> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34779a;

        static {
            Covode.recordClassIndex(16432);
        }

        C14359n(AbstractC14343f fVar) {
            this.f34779a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14207x xVar) {
            final int size = this.f34779a.f34726d.mo22803b().mo109891d().size() - 1;
            final Effect value = this.f34779a.mo23167t().mo119302n().mo119323b().getValue();
            if (C75466g.m132362n(value)) {
                this.f34779a.mo23164q().mo22899f(false);
                this.f34779a.f34726d.mo22747A().mo56908a(new RecordInvoker.OnARTextContentCallback(this) {
                    /* class com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f.C14359n.C143601 */

                    /* renamed from: a */
                    final /* synthetic */ C14359n f34780a;

                    static {
                        Covode.recordClassIndex(16433);
                    }

                    {
                        this.f34780a = r1;
                    }

                    @Override // com.p2082ss.android.medialib.RecordInvoker.OnARTextContentCallback
                    public final void onResult(final String[] strArr) {
                        this.f34780a.f34779a.f34731i.f169900g.post(new Runnable(this) {
                            /* class com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f.C14359n.C143601.RunnableC143611 */

                            /* renamed from: a */
                            final /* synthetic */ C143601 f34783a;

                            static {
                                Covode.recordClassIndex(16434);
                            }

                            {
                                this.f34783a = r1;
                            }

                            public final void run() {
                                ArrayList arrayList;
                                int size = this.f34783a.f34780a.f34779a.f34726d.mo22803b().mo109891d().size() - 1;
                                int i = size;
                                if (i >= 0 && size >= i) {
                                    TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) this.f34783a.f34780a.f34779a.f34726d.mo22803b().mo109891d().get(size);
                                    String[] strArr = strArr;
                                    boolean z = false;
                                    if (strArr == null || strArr.length == 0) {
                                        z = true;
                                    }
                                    ArrayList arrayList2 = null;
                                    if (!z) {
                                        arrayList = new ArrayList(C89064i.m154508i(strArr));
                                    } else {
                                        arrayList = null;
                                    }
                                    timeSpeedModelExtension.setBubbleText(arrayList);
                                    if (C75466g.m132359k(value)) {
                                        arrayList2 = arrayList;
                                    }
                                    timeSpeedModelExtension.setARText(arrayList2);
                                }
                                this.f34783a.f34780a.f34779a.mo23164q().mo22899f(true);
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: a */
    public final void mo23157a(AbstractC75633m mVar) {
        C89219l.m154721d(mVar, "");
        this.f34731i.mo23157a(mVar);
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$l */
    static final class C14357l<T> implements AbstractC2565m<C14206w> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34777a;

        static {
            Covode.recordClassIndex(16430);
        }

        C14357l(AbstractC14343f fVar) {
            this.f34777a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14206w wVar) {
            boolean z;
            C14206w wVar2 = wVar;
            FaceStickerBean i = this.f34777a.mo23127i();
            C89219l.m154716b(wVar2, "");
            Bundle bundle = wVar2.f34484c;
            bundle.putParcelable("currentSticker", i);
            if (i != null) {
                wVar2.f34484c.putBoolean("is_uploadtype_sticker", C14374g.m26230a(i));
                if (C75466g.m132363o(C75346e.m132154a(this.f34777a)) || C75466g.m132361m(C75346e.m132154a(this.f34777a))) {
                    z = true;
                } else {
                    z = false;
                }
                wVar2.f34484c.putBoolean("is_texttype_sticker", z);
            }
            List<AVChallenge> a = C14339e.m26183a((AbstractC75649i) this.f34777a.getApiComponent());
            if (a != null && !a.isEmpty()) {
                Collection a2 = C14339e.m26183a((AbstractC75649i) this.f34777a.getApiComponent());
                if (a2 == null) {
                    a2 = C89086z.INSTANCE;
                }
                bundle.putParcelableArrayList("currentChallenge", new ArrayList<>(a2));
            }
            AbstractC14343f fVar = this.f34777a;
            fVar.f34731i.f169900g.post(new RunnableC14372x(fVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r1 == null) goto L_0x003c;
     */
    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23118a(boolean r6) {
        /*
            r5 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r5.mo23166s()
            com.bytedance.creativex.recorder.b.a.d r0 = r5.f34726d
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.mo22803b()
            java.lang.String r4 = r0.f155669y
            if (r3 == 0) goto L_0x001a
            java.util.List r0 = r3.getTags()
            if (r0 == 0) goto L_0x001a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            return
        L_0x001b:
            java.util.List r1 = r3.getTags()
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "strong_beat"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001a
            com.bytedance.creativex.recorder.sticker.b.f$a r0 = r5.f34729g
            h.f.a.b<? super java.lang.String, java.lang.String> r0 = r0.f34751c
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x003c
            p4600h.p4611f.p4613b.C89219l.m154716b(r4, r2)
            java.lang.Object r1 = r0.invoke(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            com.ss.android.ugc.asve.recorder.view.ASCameraView r0 = r5.f34727e
            com.ss.android.ugc.asve.recorder.effect.a r0 = r0.getEffectController()
            r0.mo56811d(r1)
            if (r6 == 0) goto L_0x001a
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r2)
            com.bytedance.creativex.recorder.sticker.b.e$b r0 = com.bytedance.creativex.recorder.sticker.p948b.C14339e.C14341b.INSTANCE
            com.ss.android.ugc.aweme.sticker.presenter.handler.m r1 = r5.mo23154a(r0)
            boolean r0 = r1 instanceof com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75632l
            if (r0 != 0) goto L_0x0056
            r1 = 0
        L_0x0056:
            com.ss.android.ugc.aweme.sticker.presenter.handler.l r1 = (com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75632l) r1
            if (r1 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.sticker.panel.guide.i r0 = r1.f170046a
            r0.mo119216a(r3)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f.mo23118a(boolean):void");
    }

    /* renamed from: a */
    public void mo23155a(FrameLayout frameLayout, C75972r.AbstractC75974b bVar) {
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(bVar, "");
        mo23157a(this.f34722E);
        AbstractC75550j jVar = (AbstractC75550j) getDiContainer().mo35254c(AbstractC75550j.class);
        if (jVar != null) {
            AbstractC75549i a = jVar.mo118947a(frameLayout);
            a.mo119215a(this);
            mo23157a(new C75632l(a));
            this.f34735m = new C75635n(this.f34724b, mo23167t(), a, new C14348e(this, frameLayout));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23158a(AbstractC75633m mVar, boolean z) {
        C89219l.m154721d(mVar, "");
        this.f34731i.mo119307a(mVar, z);
    }

    public AbstractC14343f(C21582f fVar, AbstractC89172b<? super C14344a, C89391z> bVar) {
        C89219l.m154721d(fVar, "");
        this.f34723F = fVar;
        ActivityC0218d dVar = (ActivityC0218d) getDiContainer().mo35248a(ActivityC0218d.class, (String) null);
        this.f34724b = dVar;
        AbstractC75429h hVar = (AbstractC75429h) getDiContainer().mo35254c(AbstractC75429h.class);
        this.f34725c = hVar == null ? C75426e.f169510a : hVar;
        AbstractC14177d dVar2 = (AbstractC14177d) getDiContainer().mo35248a(AbstractC14177d.class, (String) null);
        this.f34726d = dVar2;
        this.f34718A = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        ASCameraView A = dVar2.mo22747A();
        this.f34727e = A;
        this.f34728f = C21572a.m40504a(getDiContainer(), AbstractC84398d.class);
        C14344a aVar = new C14344a();
        this.f34729g = aVar;
        if (bVar != null) {
            bVar.invoke(aVar);
        }
        this.f34730h = new C88411a();
        this.f34731i = new C14350g(this, dVar, aVar.f34752d);
        this.f34732j = dVar2.mo22818g();
        this.f34733k = new C14336b(aVar.f34756h, aVar.f34757i, new C14365r(this));
        this.f34734l = new C14337c(A.getCameraController());
        this.f34719B = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C14366s(this));
        this.f34720C = C89250i.m154774a(EnumC89331m.NONE, new C14371w(this));
        this.f34721D = C89250i.m154774a(EnumC89331m.NONE, new C14368u(this));
        this.f34722E = new C14367t(this);
        this.f34736n = new C14370v(this);
        this.f34737o = new C2563k<>();
        this.f34738p = new C2563k<>();
        this.f34739q = new C2563k<>();
        this.f34740r = new C2563k<>();
        this.f34741s = new C14338d();
        this.f34742t = new C2563k<>();
        this.f34743u = new C2563k<>();
        this.f34744v = new C2563k<>();
        this.f34745w = new C2563k<>();
        this.f34746x = new C2563k<>();
        C88960c<C89378p<Effect, C14335a>> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f34747y = cVar;
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: a */
    public void mo23117a(C75972r.AbstractC75974b bVar, FrameLayout frameLayout) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(frameLayout, "");
        mo23155a(frameLayout, bVar);
        C14350g gVar = this.f34731i;
        for (T t : gVar.f169897d) {
            AbstractC75573i iVar = gVar.f169899f;
            if (iVar != null) {
                iVar.mo119133a((AbstractC75498c) t);
            }
        }
        AbstractC75655o t2 = mo23167t();
        C89219l.m154721d(t2, "");
        AbstractC75711q.AbstractC75712a a = t2.mo119291c().mo119461g().mo119441a();
        if (this.f34726d.mo22803b().f155653i) {
            a.mo119444a(C75738i.f170154a);
        }
        mo23160a(a);
        a.mo119443a();
        mo23159a(mo23167t(), mo23168u());
        this.f34731i.mo119308c();
        GameDuetResource gameDuetResource = mo23165r().f155666v;
        if (!(gameDuetResource == null || gameDuetResource.gameSticker == null || C72847c.m128639e(gameDuetResource.gameSticker))) {
            C75346e.m132156a(this, gameDuetResource.gameSticker);
        }
        this.f34745w.mo6999a((C89391z) null);
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$v */
    static final class C14370v implements MessageCenter.Listener {

        /* renamed from: a */
        final /* synthetic */ AbstractC14343f f34793a;

        static {
            Covode.recordClassIndex(16443);
        }

        C14370v(AbstractC14343f fVar) {
            this.f34793a = fVar;
        }

        @Override // com.bef.effectsdk.message.MessageCenter.Listener
        public final void onMessageReceived(int i, int i2, int i3, String str) {
            AbstractC14343f fVar = this.f34793a;
            Iterator<T> it = fVar.f34731i.f169898e.iterator();
            while (it.hasNext()) {
                it.next().mo23211a(i, i2, i3, str);
            }
            fVar.f34747y.onNext(C89387v.m154943a(fVar.mo23166s(), new C14335a(i, i2, i3, str)));
        }
    }
}
