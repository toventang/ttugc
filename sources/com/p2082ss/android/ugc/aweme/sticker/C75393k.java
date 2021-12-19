package com.p2082ss.android.ugc.aweme.sticker;

import android.os.Build;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.C14389e;
import com.bytedance.creativex.recorder.sticker.panel.C14395g;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68101j;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75550j;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75530b;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75565m;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4310b.C83959a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.sticker.k */
public final class C75393k {
    static {
        Covode.recordClassIndex(88312);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.k$b */
    public static final class C75395b implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f169471a = {new C89232y(C75395b.class, "gameApiComponent", "getGameApiComponent()Lcom/ss/android/ugc/aweme/sticker/GameStickerApiComponent;", 0)};

        /* renamed from: b */
        final /* synthetic */ C21582f f169472b;

        /* renamed from: c */
        private final AbstractC89248d f169473c;

        static {
            Covode.recordClassIndex(88314);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            AbstractC75314e eVar = (AbstractC75314e) this.f169473c.mo23374a(this, f169471a[0]);
            if (eVar != null) {
                z = eVar.mo118897b();
            }
            return Boolean.valueOf(z);
        }

        C75395b(C21582f fVar) {
            this.f169472b = fVar;
            this.f169473c = C21572a.m40505b(fVar, AbstractC75314e.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.k$a */
    public static final class C75394a implements AbstractC75550j {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f169470a;

        static {
            Covode.recordClassIndex(88313);
        }

        C75394a(ShortVideoContext shortVideoContext) {
            this.f169470a = shortVideoContext;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75550j
        /* renamed from: a */
        public final AbstractC75549i mo118947a(FrameLayout frameLayout) {
            C89219l.m154721d(frameLayout, "");
            ShortVideoContext shortVideoContext = this.f169470a;
            C89219l.m154721d(shortVideoContext, "");
            C75565m.C75568c cVar = C75565m.C75568c.f169824a;
            C89219l.m154721d(cVar, "");
            C75530b bVar = new C75530b(cVar, (byte) 0);
            bVar.mo119248a(new C75565m.C75566a(shortVideoContext));
            bVar.f169763a = new C75565m.C75567b(shortVideoContext);
            return new DefaultStickerGuidePresenter(bVar, frameLayout);
        }
    }

    /* renamed from: a */
    public static final AbstractC75550j m132223a(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        return new C75394a(shortVideoContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.k$c */
    public static final class C75396c extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f169474a;

        static {
            Covode.recordClassIndex(88315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75396c(ActivityC0945e eVar) {
            super(1);
            this.f169474a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i = Build.VERSION.SDK_INT;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.k$d */
    static final class C75397d extends AbstractC89220m implements AbstractC89172b<C14389e.C14390a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21582f f169475a;

        static {
            Covode.recordClassIndex(88316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75397d(C21582f fVar) {
            super(1);
            this.f169475a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14389e.C14390a aVar) {
            C14389e.C14390a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f34834a = C75393k.m132225a((ActivityC0945e) this.f169475a.mo35249a((Type) ActivityC0945e.class, (String) null));
            aVar2.f34835b = C75393k.m132224a(this.f169475a);
            C21582f fVar = this.f169475a;
            C89219l.m154721d(fVar, "");
            aVar2.f34836c = new C83959a(fVar);
            aVar2.f34837d = C68101j.m120396a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final AbstractC89171a<Boolean> m132224a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        return new C75395b(fVar);
    }

    /* renamed from: a */
    public static final AbstractC89172b<Boolean, Boolean> m132225a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return new C75396c(eVar);
    }

    /* renamed from: a */
    public static final C14395g m132222a(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        return new C14395g(fVar, bVar, R.id.dg9, new C75397d(fVar));
    }
}
