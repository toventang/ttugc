package com.bytedance.android.live.effect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.effect.api.p240a.AbstractC4154g;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.live.effect.p242c.C4204f;
import com.bytedance.android.live.effect.widget.BeautyIconWidget;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.f */
public final class C4269f extends C10935a implements AdjustPercentBar.AbstractC11338b {

    /* renamed from: e */
    public static final C4270a f11789e = new C4270a((byte) 0);

    /* renamed from: a */
    public AdjustPercentBar f11790a;

    /* renamed from: b */
    BeautyIconWidget f11791b;

    /* renamed from: c */
    public AbstractC4154g f11792c;

    /* renamed from: d */
    public C4312b f11793d;

    /* renamed from: f */
    private final AbstractC89244h f11794f = C89250i.m154773a((AbstractC89171a) new C4275d(this));

    /* renamed from: g */
    private final AbstractC89244h f11795g = C89250i.m154773a((AbstractC89171a) new C4271b(this));

    /* renamed from: h */
    private final AbstractC89244h f11796h = C89250i.m154773a((AbstractC89171a) new C4273c(this));

    /* renamed from: i */
    private HashMap f11797i;

    static {
        Covode.recordClassIndex(4839);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final BeautyIconWidget mo9951a() {
        return (BeautyIconWidget) this.f11794f.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final BeautyIconWidget mo9952b() {
        return (BeautyIconWidget) this.f11795g.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final BeautyIconWidget mo9954c() {
        return (BeautyIconWidget) this.f11796h.getValue();
    }

    /* renamed from: com.bytedance.android.live.effect.f$a */
    public static final class C4270a {
        static {
            Covode.recordClassIndex(4840);
        }

        private C4270a() {
        }

        public /* synthetic */ C4270a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.f$b */
    static final class C4271b extends AbstractC89220m implements AbstractC89171a<BeautyIconWidget> {

        /* renamed from: a */
        final /* synthetic */ C4269f f11798a;

        static {
            Covode.recordClassIndex(4841);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4271b(C4269f fVar) {
            super(0);
            this.f11798a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BeautyIconWidget invoke() {
            return new BeautyIconWidget(new AbstractC89172b<View, C89391z>(this.f11798a) {
                /* class com.bytedance.android.live.effect.C4269f.C4271b.C42721 */

                static {
                    Covode.recordClassIndex(4842);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(View view) {
                    C4269f fVar = (C4269f) this.receiver;
                    fVar.mo9951a().mo9999b();
                    fVar.mo9952b().mo9997a();
                    fVar.mo9954c().mo9999b();
                    fVar.f11791b = fVar.mo9952b();
                    AdjustPercentBar adjustPercentBar = fVar.f11790a;
                    if (adjustPercentBar != null) {
                        C6805b<Float> bVar = AbstractC6804a.f16889R;
                        C89219l.m154716b(bVar, "");
                        adjustPercentBar.setPercent((int) (bVar.mo13066a().floatValue() * 100.0f));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.bytedance.android.live.effect.f$c */
    static final class C4273c extends AbstractC89220m implements AbstractC89171a<BeautyIconWidget> {

        /* renamed from: a */
        final /* synthetic */ C4269f f11799a;

        static {
            Covode.recordClassIndex(4843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4273c(C4269f fVar) {
            super(0);
            this.f11799a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BeautyIconWidget invoke() {
            return new BeautyIconWidget(new AbstractC89172b<View, C89391z>(this.f11799a) {
                /* class com.bytedance.android.live.effect.C4269f.C4273c.C42741 */

                static {
                    Covode.recordClassIndex(4844);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(View view) {
                    C4269f fVar = (C4269f) this.receiver;
                    fVar.mo9951a().mo9999b();
                    fVar.mo9952b().mo9999b();
                    fVar.mo9954c().mo9997a();
                    fVar.f11791b = fVar.mo9954c();
                    AdjustPercentBar adjustPercentBar = fVar.f11790a;
                    if (adjustPercentBar != null) {
                        C6805b<Float> bVar = AbstractC6804a.f16890S;
                        C89219l.m154716b(bVar, "");
                        adjustPercentBar.setPercent((int) (bVar.mo13066a().floatValue() * 100.0f));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.bytedance.android.live.effect.f$d */
    static final class C4275d extends AbstractC89220m implements AbstractC89171a<BeautyIconWidget> {

        /* renamed from: a */
        final /* synthetic */ C4269f f11800a;

        static {
            Covode.recordClassIndex(4845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4275d(C4269f fVar) {
            super(0);
            this.f11800a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BeautyIconWidget invoke() {
            return new BeautyIconWidget(new AbstractC89172b<View, C89391z>(this.f11800a) {
                /* class com.bytedance.android.live.effect.C4269f.C4275d.C42761 */

                static {
                    Covode.recordClassIndex(4846);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(View view) {
                    C4269f fVar = (C4269f) this.receiver;
                    fVar.mo9951a().mo9997a();
                    fVar.mo9952b().mo9999b();
                    fVar.mo9954c().mo9999b();
                    fVar.f11791b = fVar.mo9951a();
                    AdjustPercentBar adjustPercentBar = fVar.f11790a;
                    if (adjustPercentBar != null) {
                        C6805b<Float> bVar = AbstractC6804a.f16888Q;
                        C89219l.m154716b(bVar, "");
                        adjustPercentBar.setPercent((int) (bVar.mo13066a().floatValue() * 100.0f));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f11797i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.AbstractC11338b
    /* renamed from: a */
    public final void mo9931a(int i) {
        AbstractC4154g gVar;
        BeautyIconWidget beautyIconWidget = this.f11791b;
        if (beautyIconWidget == null) {
            C89219l.m154710a("mSelectedIcon");
        }
        if (C89219l.m154714a(beautyIconWidget, mo9951a())) {
            AbstractC4154g gVar2 = this.f11792c;
            if (gVar2 != null) {
                gVar2.mo8874a(((float) i) / 100.0f);
            }
        } else if (C89219l.m154714a(beautyIconWidget, mo9952b())) {
            AbstractC4154g gVar3 = this.f11792c;
            if (gVar3 != null) {
                gVar3.mo8875b(((float) i) / 100.0f);
            }
        } else if (C89219l.m154714a(beautyIconWidget, mo9954c()) && (gVar = this.f11792c) != null) {
            gVar.mo8876c(((float) i) / 100.0f);
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.AbstractC11338b
    /* renamed from: b */
    public final void mo9953b(int i) {
        String str;
        String str2;
        C4312b bVar = this.f11793d;
        if (bVar != null) {
            str = bVar.f11859c;
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "live_take_detail")) {
            str2 = "broadcast";
        } else {
            str2 = "preview";
        }
        C6497a b = C3051c.C3052a.m8359a("ttlive_change_beauty").mo12633b(str2);
        BeautyIconWidget beautyIconWidget = this.f11791b;
        if (beautyIconWidget == null) {
            C89219l.m154710a("mSelectedIcon");
        }
        if (C89219l.m154714a(beautyIconWidget, mo9951a())) {
            C6805b<Float> bVar2 = AbstractC6804a.f16888Q;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a(bVar2, Float.valueOf(((float) i) / 100.0f));
            C6805b<Float> bVar3 = AbstractC6804a.f16888Q;
            C89219l.m154716b(bVar3, "");
            b.mo12626a("beauty_skin", bVar3.mo13066a());
        } else if (C89219l.m154714a(beautyIconWidget, mo9952b())) {
            C6805b<Float> bVar4 = AbstractC6804a.f16889R;
            C89219l.m154716b(bVar4, "");
            C6806c.m14603a(bVar4, Float.valueOf(((float) i) / 100.0f));
            C6805b<Float> bVar5 = AbstractC6804a.f16889R;
            C89219l.m154716b(bVar5, "");
            b.mo12626a("big_eyes", bVar5.mo13066a());
        } else if (C89219l.m154714a(beautyIconWidget, mo9954c())) {
            C6805b<Float> bVar6 = AbstractC6804a.f16890S;
            C89219l.m154716b(bVar6, "");
            C6806c.m14603a(bVar6, Float.valueOf(((float) i) / 100.0f));
            C6805b<Float> bVar7 = AbstractC6804a.f16890S;
            C89219l.m154716b(bVar7, "");
            b.mo12626a("face_lift", bVar7.mo13066a());
        }
        b.mo12632a();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            new C4204f().mo9881a(room.getId());
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        WidgetManager of = WidgetManager.m22024of(this, view, C6204h.f15480c);
        of.load(R.id.e3f, mo9951a());
        of.load(R.id.ay_, mo9952b());
        of.load(R.id.dj5, mo9954c());
        this.f11791b = mo9951a();
        mo9951a().mo9998a(2131234414, R.string.grm, true);
        mo9952b().mo9998a(2131234412, R.string.e9o, false);
        mo9954c().mo9998a(2131234413, R.string.gk_, false);
        AdjustPercentBar adjustPercentBar = this.f11790a;
        if (adjustPercentBar != null) {
            adjustPercentBar.setOnLevelChangeListener(this);
        }
        AdjustPercentBar adjustPercentBar2 = this.f11790a;
        if (adjustPercentBar2 != null) {
            adjustPercentBar2.mo18118a(C3966y.m9663b((int) R.color.v2), C3966y.m9663b((int) R.color.v0), C3966y.m9663b((int) R.color.v1));
        }
        AdjustPercentBar adjustPercentBar3 = this.f11790a;
        if (adjustPercentBar3 != null) {
            adjustPercentBar3.mo18119a(100, 0, 0, true);
        }
        AdjustPercentBar adjustPercentBar4 = this.f11790a;
        if (adjustPercentBar4 != null) {
            C6805b<Float> bVar = AbstractC6804a.f16888Q;
            C89219l.m154716b(bVar, "");
            adjustPercentBar4.setPercent((int) (bVar.mo13066a().floatValue() * 100.0f));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b8j, viewGroup, false);
    }
}
