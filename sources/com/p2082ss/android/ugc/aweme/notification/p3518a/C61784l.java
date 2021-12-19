package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f;
import com.p2082ss.android.ugc.aweme.notification.p3521c.C61917a;
import com.p2082ss.android.ugc.aweme.notification.p3521c.C61919c;
import com.p2082ss.android.ugc.aweme.notification.p3521c.C61921d;
import com.p2082ss.android.ugc.aweme.notification.p3521c.C61923f;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62167x;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a.l */
public final class C61784l extends AbstractC61760c {

    /* renamed from: b */
    final AbstractC89244h f140264b = C89250i.m154773a((AbstractC89171a) C61787c.f140273a);

    /* renamed from: c */
    final AbstractC89244h f140265c = C89250i.m154773a((AbstractC89171a) C61785a.f140271a);

    /* renamed from: d */
    final AbstractC89244h f140266d = C89250i.m154773a((AbstractC89171a) C61789e.f140275a);

    /* renamed from: e */
    final AbstractC89244h f140267e = C89250i.m154773a((AbstractC89171a) C61786b.f140272a);

    /* renamed from: f */
    public final int f140268f;

    /* renamed from: g */
    public final String f140269g;

    /* renamed from: h */
    public final String f140270h;

    static {
        Covode.recordClassIndex(72517);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.l$a */
    static final class C61785a extends AbstractC89220m implements AbstractC89171a<C61917a> {

        /* renamed from: a */
        public static final C61785a f140271a = new C61785a();

        static {
            Covode.recordClassIndex(72518);
        }

        C61785a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61917a invoke() {
            return new C61917a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.l$b */
    static final class C61786b extends AbstractC89220m implements AbstractC89171a<C61919c> {

        /* renamed from: a */
        public static final C61786b f140272a = new C61786b();

        static {
            Covode.recordClassIndex(72519);
        }

        C61786b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61919c invoke() {
            return new C61919c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.l$c */
    static final class C61787c extends AbstractC89220m implements AbstractC89171a<C61921d> {

        /* renamed from: a */
        public static final C61787c f140273a = new C61787c();

        static {
            Covode.recordClassIndex(72520);
        }

        C61787c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61921d invoke() {
            return new C61921d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.l$d */
    public static final class C61788d implements AbstractC61766f {

        /* renamed from: a */
        final /* synthetic */ C61784l f140274a;

        static {
            Covode.recordClassIndex(72521);
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: a */
        public final List<BaseNotice> mo99867a(List<BaseNotice> list) {
            C89219l.m154721d(list, "");
            return list;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: c */
        public final String mo99870c() {
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: a */
        public final String mo99866a() {
            return this.f140274a.f140269g;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: b */
        public final String mo99869b() {
            return AbstractC61766f.C61767a.m111816a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61788d(C61784l lVar) {
            this.f140274a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo99865a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.l4, viewGroup, false);
            C89219l.m154716b(a, "");
            View$OnClickListenerC62167x xVar = new View$OnClickListenerC62167x(a);
            xVar.f141157a = this.f140274a.mo99872b();
            return xVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: a */
        public final void mo99868a(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> hashMap) {
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(baseNotice, "");
            C89219l.m154721d(hashMap, "");
            if ((baseNotice instanceof MusNotice) && (viewHolder instanceof View$OnClickListenerC62167x)) {
                View$OnClickListenerC62167x xVar = (View$OnClickListenerC62167x) viewHolder;
                MusNotice musNotice = (MusNotice) baseNotice;
                String str = this.f140274a.f140270h;
                C61784l lVar = this.f140274a;
                int i2 = baseNotice.type;
                ArrayList arrayList = new ArrayList();
                if (i2 == 6) {
                    arrayList.add(lVar.f140264b.getValue());
                } else if (i2 == 212) {
                    arrayList.add(lVar.f140265c.getValue());
                } else if (i2 == 215) {
                    arrayList.add(lVar.f140266d.getValue());
                } else if (i2 == 218) {
                    arrayList.add(lVar.f140267e.getValue());
                }
                xVar.mo100167a(musNotice, i, "", str, "", true, (List<? extends AbstractC62329c>) arrayList);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.l$e */
    static final class C61789e extends AbstractC89220m implements AbstractC89171a<C61923f> {

        /* renamed from: a */
        public static final C61789e f140275a = new C61789e();

        static {
            Covode.recordClassIndex(72522);
        }

        C61789e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61923f invoke() {
            return new C61923f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61760c
    /* renamed from: a */
    public final AbstractC61766f mo99864a() {
        return new C61788d(this);
    }

    public C61784l(int i, String str, String str2) {
        C89219l.m154721d(str, "");
        this.f140268f = i;
        this.f140269g = str;
        this.f140270h = str2;
    }
}
