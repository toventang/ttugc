package com.bytedance.android.live.liveinteract.match.p311ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.p219a.C3889a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.match.p294a.C4939b;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.EnumC11698e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinningStreaksIconView */
public final class MatchWinningStreaksIconView extends LinearLayout {

    /* renamed from: e */
    public static final C5060a f13149e = new C5060a((byte) 0);

    /* renamed from: a */
    AbstractC89172b<? super String, C89391z> f13150a;

    /* renamed from: b */
    C11695b f13151b;

    /* renamed from: c */
    public final TextView f13152c = ((TextView) findViewById(R.id.fix));

    /* renamed from: d */
    public final TextView f13153d = ((TextView) findViewById(R.id.fiz));

    /* renamed from: f */
    private final HSImageView f13154f = ((HSImageView) findViewById(R.id.fj0));

    /* renamed from: g */
    private final View f13155g = findViewById(R.id.fff);

    /* renamed from: h */
    private final TextView f13156h = ((TextView) findViewById(R.id.fiy));

    static {
        Covode.recordClassIndex(5646);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinningStreaksIconView$a */
    public static final class C5060a {
        static {
            Covode.recordClassIndex(5648);
        }

        private C5060a() {
        }

        public /* synthetic */ C5060a(byte b) {
            this();
        }
    }

    public final C11695b getInfo() {
        return this.f13151b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, h.z>, h.f.a.b<java.lang.String, h.z> */
    public final AbstractC89172b<String, C89391z> getOnClicked() {
        return this.f13150a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinningStreaksIconView$b */
    public static final class C5061b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MatchWinningStreaksIconView f13158a;

        static {
            Covode.recordClassIndex(5649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5061b(MatchWinningStreaksIconView matchWinningStreaksIconView) {
            super(0);
            this.f13158a = matchWinningStreaksIconView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C3854a.m9453a(3, "MatchWinningStreaksIcon", "animation end");
            TextView textView = this.f13158a.f13152c;
            C89219l.m154716b(textView, "");
            textView.setVisibility(0);
            TextView textView2 = this.f13158a.f13153d;
            C89219l.m154716b(textView2, "");
            textView2.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinningStreaksIconView$c */
    public static final class C5062c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MatchWinningStreaksIconView f13159a;

        static {
            Covode.recordClassIndex(5650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5062c(MatchWinningStreaksIconView matchWinningStreaksIconView) {
            super(0);
            this.f13159a = matchWinningStreaksIconView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C3854a.m9453a(3, "MatchWinningStreaksIcon", "animation end");
            TextView textView = this.f13159a.f13152c;
            C89219l.m154716b(textView, "");
            textView.setVisibility(0);
            TextView textView2 = this.f13159a.f13153d;
            C89219l.m154716b(textView2, "");
            textView2.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    public final void setOnClicked(AbstractC89172b<? super String, C89391z> bVar) {
        this.f13150a = bVar;
    }

    public final void setVisibility(int i) {
        if (this.f13151b != null) {
            super.setVisibility(i);
        }
    }

    private final void setCountTv(C11695b bVar) {
        if (bVar.f27978c > 99) {
            TextView textView = this.f13152c;
            C89219l.m154716b(textView, "");
            textView.setText("99+");
            return;
        }
        TextView textView2 = this.f13152c;
        C89219l.m154716b(textView2, "");
        textView2.setText(String.valueOf(bVar.f27978c));
    }

    /* renamed from: a */
    public final boolean mo10790a(C11695b bVar) {
        if (bVar != null) {
            C3854a.m9453a(3, "MatchWinningStreaksIcon", "set data");
            this.f13151b = bVar;
            if (bVar.f27980e == EnumC11698e.ACTIVITY.getType()) {
                HSImageView hSImageView = this.f13154f;
                C89219l.m154716b(hSImageView, "");
                hSImageView.setVisibility(0);
                HSImageView hSImageView2 = this.f13154f;
                String str = bVar.f27979d;
                if (hSImageView2 != null && !TextUtils.isEmpty(str) && C3951p.m9629a(hSImageView2.getContext())) {
                    C3889a a = C3889a.m9507a(hSImageView2.getContext()).mo9251a(str).mo9247a(2131234903).mo9249a(ImageView.ScaleType.CENTER_CROP);
                    a.f10753b = new C3941k.C3945b(null, null);
                    a.mo9252a(hSImageView2);
                }
                View view = this.f13155g;
                C89219l.m154716b(view, "");
                view.setVisibility(8);
            } else {
                HSImageView hSImageView3 = this.f13154f;
                C89219l.m154716b(hSImageView3, "");
                hSImageView3.setVisibility(8);
                View view2 = this.f13155g;
                C89219l.m154716b(view2, "");
                view2.setVisibility(0);
            }
            setCountTv(bVar);
            m11276a(bVar, new C11695b((byte) 0));
            setVisibility(0);
            return true;
        }
        setVisibility(8);
        return false;
    }

    /* renamed from: a */
    private final void m11276a(C11695b bVar, C11695b bVar2) {
        long j;
        String str;
        if (bVar.f27978c > bVar2.f27978c) {
            j = bVar.f27978c;
        } else {
            j = bVar2.f27978c;
        }
        TextView textView = this.f13156h;
        C89219l.m154716b(textView, "");
        if (j > 99) {
            str = "99+";
        } else if (j > 9) {
            str = "99";
        } else {
            str = "9";
        }
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MatchWinningStreaksIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5881);
        LayoutInflater.from(context).inflate(R.layout.bbp, this);
        setOrientation(0);
        setBackgroundResource(R.drawable.c8z);
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.liveinteract.match.p311ui.view.MatchWinningStreaksIconView.View$OnClickListenerC50591 */

            /* renamed from: a */
            final /* synthetic */ MatchWinningStreaksIconView f13157a;

            static {
                Covode.recordClassIndex(5647);
            }

            {
                this.f13157a = r1;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                AbstractC89172b<? super String, C89391z> bVar;
                MatchWinningStreaksIconView matchWinningStreaksIconView = this.f13157a;
                C11695b bVar2 = matchWinningStreaksIconView.f13151b;
                if (bVar2 == null || (str2 = bVar2.f27981f) == null || (bVar = matchWinningStreaksIconView.f13150a) == null || bVar.invoke(str2) == null) {
                    StringBuilder sb = new StringBuilder("no data , cant click, show error; ");
                    C11695b bVar3 = matchWinningStreaksIconView.f13151b;
                    if (bVar3 == null || (str = bVar3.toString()) == null) {
                        str = "";
                    }
                    C3854a.m9453a(6, "MatchWinningStreaksIcon", sb.append(str).toString());
                }
            }
        });
        MethodCollector.m26664o(5881);
    }

    /* renamed from: a */
    public final void mo10789a(C11695b bVar, boolean z) {
        boolean z2;
        Long l;
        C3854a.m9453a(3, "MatchWinningStreaksIcon", "update count");
        if (bVar == null || this.f13151b == null) {
            C3854a.m9453a(3, "MatchWinningStreaksIcon", "info is empty");
            return;
        }
        long j = bVar.f27978c;
        C11695b bVar2 = this.f13151b;
        if (bVar2 == null) {
            C89219l.m154715b();
        }
        if (j == bVar2.f27978c) {
            C3854a.m9453a(3, "MatchWinningStreaksIcon", "same count info");
            return;
        }
        C11695b bVar3 = this.f13151b;
        if (bVar3 == null) {
            C89219l.m154715b();
        }
        if (bVar3.f27978c <= 99) {
            z2 = true;
        } else {
            z2 = false;
        }
        TextView textView = this.f13153d;
        C89219l.m154716b(textView, "");
        C11695b bVar4 = this.f13151b;
        if (bVar4 != null) {
            l = Long.valueOf(bVar4.f27978c);
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        if (valueOf == null) {
            valueOf = "0";
        }
        textView.setText(valueOf);
        C11695b bVar5 = this.f13151b;
        if (bVar5 == null) {
            C89219l.m154715b();
        }
        m11276a(bVar, bVar5);
        this.f13151b = bVar;
        setCountTv(bVar);
        if (!z2) {
            TextView textView2 = this.f13152c;
            C89219l.m154716b(textView2, "");
            textView2.setVisibility(0);
            TextView textView3 = this.f13153d;
            C89219l.m154716b(textView3, "");
            textView3.setVisibility(8);
        } else if (z) {
            TextView textView4 = this.f13153d;
            C89219l.m154716b(textView4, "");
            TextView textView5 = this.f13152c;
            C89219l.m154716b(textView5, "");
            C4939b.m11141a(textView4, textView5, new C5061b(this));
        } else {
            TextView textView6 = this.f13153d;
            C89219l.m154716b(textView6, "");
            TextView textView7 = this.f13152c;
            C89219l.m154716b(textView7, "");
            C4939b.m11142b(textView6, textView7, new C5062c(this));
        }
    }
}
