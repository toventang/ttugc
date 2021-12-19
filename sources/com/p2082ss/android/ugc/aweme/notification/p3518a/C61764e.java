package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a.e */
public final class C61764e extends AbstractC61760c {
    static {
        Covode.recordClassIndex(72497);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.e$a */
    public static final class C61765a implements AbstractC61766f {

        /* renamed from: a */
        final /* synthetic */ C61764e f140159a;

        static {
            Covode.recordClassIndex(72498);
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: c */
        public final String mo99870c() {
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: b */
        public final String mo99869b() {
            return AbstractC61766f.C61767a.m111816a();
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: a */
        public final String mo99866a() {
            String string = C17867d.m33078a().getString(R.string.a7a);
            C89219l.m154716b(string, "");
            return string;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61765a(C61764e eVar) {
            this.f140159a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo99865a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.kn, viewGroup, false);
            C89219l.m154716b(a, "");
            return new View$OnClickListenerC61761d(a, this.f140159a.mo99872b());
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: a */
        public final List<BaseNotice> mo99867a(List<BaseNotice> list) {
            C89219l.m154721d(list, "");
            ArrayList arrayList = new ArrayList();
            for (BaseNotice baseNotice : list) {
                if (baseNotice.businessAccountNotice != null) {
                    arrayList.add(baseNotice);
                } else if (baseNotice.templateNotice != null) {
                    arrayList.add(baseNotice);
                }
            }
            return arrayList;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f
        /* renamed from: a */
        public final void mo99868a(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> hashMap) {
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(baseNotice, "");
            C89219l.m154721d(hashMap, "");
            if (viewHolder instanceof View$OnClickListenerC61761d) {
                ((View$OnClickListenerC61761d) viewHolder).mo99873a(baseNotice);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61760c
    /* renamed from: a */
    public final AbstractC61766f mo99864a() {
        return new C61765a(this);
    }
}
