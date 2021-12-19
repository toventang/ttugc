package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75522g;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.C76238b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76120g;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76124k;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.StickerViewImpl */
public class StickerViewImpl extends AbstractStickerView implements AbstractC33974au {

    /* renamed from: u */
    private final AbstractC89244h f171116u;

    static {
        Covode.recordClassIndex(89118);
    }

    /* renamed from: o */
    private AbstractC76115b<C84984j, Fragment> m133588o() {
        return (AbstractC76115b) this.f171116u.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.StickerViewImpl$a */
    static final class C76169a extends AbstractC89220m implements AbstractC89171a<AbstractC76115b<C84984j, Fragment>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76115b f171117a;

        static {
            Covode.recordClassIndex(89119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76169a(AbstractC76115b bVar) {
            super(0);
            this.f171117a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76115b<C84984j, Fragment> invoke() {
            AbstractC76115b bVar = this.f171117a;
            if (bVar == null) {
                return new C76177c((byte) 0);
            }
            return bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    /* renamed from: a */
    public final void mo119920a(ViewGroup viewGroup) {
        MethodCollector.m26663i(6049);
        C89219l.m154721d(viewGroup, "");
        super.mo119920a(viewGroup);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.cxu);
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aif, frameLayout, false);
        if (a != null) {
            frameLayout.addView((ViewGroup) a);
            MethodCollector.m26664o(6049);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(6049);
        throw nullPointerException;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    /* renamed from: b */
    public final AbstractC76120g mo119922b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C75522g gVar = this.f171086t.f169850l;
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(R.id.fgr);
        C89219l.m154716b(viewPager, "");
        viewPager.setOffscreenPageLimit(3);
        ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
        if (this.f171086t.f169843e > 0) {
            Context context = viewPager.getContext();
            C89219l.m154716b(context, "");
            layoutParams.height = (int) C84912r.m145930a(context, (float) this.f171086t.f169843e);
            viewPager.setLayoutParams(layoutParams);
        }
        AbstractC89172b<? super ViewPager, C89391z> bVar = gVar.f169732b;
        if (bVar != null) {
            bVar.invoke(viewPager);
        }
        C76238b bVar2 = new C76238b(viewPager, mo119919a(), this.f171067a, this.f171083q, this.f171084r, m133588o());
        mo119923b().setSupportCustomIndicator(false);
        AbstractC89172b<? super TabLayout, C89391z> bVar3 = this.f171086t.f169850l.f169733c;
        if (bVar3 != null) {
            bVar3.invoke(mo119923b());
        }
        return new C76193l(mo119923b(), this.f171080n, this.f171082p, this.f171086t, bVar2, this.f171083q, mo119919a(), m133588o());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerViewImpl(ActivityC0945e eVar, ViewGroup viewGroup, AbstractC1204m mVar, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, AbstractC75301e eVar2, C75574j jVar, AbstractC0952i iVar, AbstractC76396a aVar2, AbstractC76115b<C84984j, Fragment> bVar2, AbstractC76124k kVar, boolean z, AbstractC76329a aVar3) {
        super(eVar, viewGroup, mVar, bVar, aVar, eVar2, jVar, kVar, iVar, aVar2, z, aVar3);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(eVar2, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(aVar3, "");
        this.f171116u = C89250i.m154773a((AbstractC89171a) new C76169a(bVar2));
    }
}
