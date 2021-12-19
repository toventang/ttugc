package com.p2082ss.android.ugc.aweme.pendant;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.pendant.m */
public final class C62805m extends AbstractC62790h {

    /* renamed from: u */
    public static final C62808a f142412u = new C62808a((byte) 0);

    /* renamed from: A */
    private final SmartImageView f142413A;

    /* renamed from: B */
    private final SmartImageView f142414B;

    /* renamed from: v */
    private List<String> f142415v;

    /* renamed from: w */
    private List<String> f142416w;

    /* renamed from: x */
    private final SmartImageView f142417x;

    /* renamed from: y */
    private final SmartImageView f142418y;

    /* renamed from: z */
    private ValueAnimator f142419z;

    static {
        Covode.recordClassIndex(73628);
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.m$a */
    public static final class C62808a {
        static {
            Covode.recordClassIndex(73631);
        }

        private C62808a() {
        }

        public /* synthetic */ C62808a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62753a
    /* renamed from: c */
    public final void mo100717c() {
        ValueAnimator valueAnimator = this.f142419z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62790h, com.p2082ss.android.ugc.aweme.pendant.AbstractC62809n
    /* renamed from: a */
    public final void mo100758a(C62802k kVar) {
        C89219l.m154721d(kVar, "");
        super.mo100758a(kVar);
        List<String> list = kVar.f142403f;
        if (list == null) {
            list = C89086z.INSTANCE;
        }
        this.f142415v = list;
        List<String> list2 = kVar.f142404g;
        if (list2 == null) {
            list2 = C89086z.INSTANCE;
        }
        this.f142416w = list2;
        List<String> list3 = this.f142415v;
        if (list3 == null) {
            C89219l.m154710a("bigPngUrlList");
        }
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            C20761r.m39066c(C20761r.m39061a((String) it.next()).mo34183b());
        }
        List<String> list4 = this.f142416w;
        if (list4 == null) {
            C89219l.m154710a("smallPngUrlList");
        }
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            C20761r.m39066c(C20761r.m39061a((String) it2.next()).mo34183b());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62805m(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, final C62795i iVar) {
        super(context, view, smartImageView, smartImageView2, view2, view3, iVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(smartImageView, "");
        C89219l.m154721d(smartImageView2, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        C89219l.m154721d(iVar, "");
        this.f142413A = smartImageView;
        this.f142414B = smartImageView2;
        View findViewById = view.findViewById(R.id.si);
        C89219l.m154716b(findViewById, "");
        SmartImageView smartImageView3 = (SmartImageView) findViewById;
        this.f142417x = smartImageView3;
        View findViewById2 = view.findViewById(R.id.e3a);
        C89219l.m154716b(findViewById2, "");
        SmartImageView smartImageView4 = (SmartImageView) findViewById2;
        this.f142418y = smartImageView4;
        smartImageView3.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.pendant.C62805m.View$OnClickListenerC628061 */

            static {
                Covode.recordClassIndex(73629);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89171a<C89391z> aVar = iVar.f142365c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        smartImageView4.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.pendant.C62805m.View$OnClickListenerC628072 */

            static {
                Covode.recordClassIndex(73630);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89171a<C89391z> aVar = iVar.f142365c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        ValueAnimator ofInt = ValueAnimator.ofInt(0);
        C89219l.m154716b(ofInt, "");
        this.f142419z = ofInt;
    }
}
