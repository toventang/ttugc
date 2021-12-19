package com.p2082ss.android.ugc.aweme.p2725d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.d.e */
public abstract class AbstractC40913e implements AbstractC40911c {

    /* renamed from: a */
    public final Activity f95725a;

    static {
        Covode.recordClassIndex(48765);
    }

    /* renamed from: a */
    public abstract void mo70116a(C40914a aVar);

    /* renamed from: com.ss.android.ugc.aweme.d.e$a */
    public class C40914a {

        /* renamed from: a */
        public final List<C89378p<Integer, Integer>> f95726a = new ArrayList();

        static {
            Covode.recordClassIndex(48766);
        }

        /* renamed from: a */
        public final void mo70118a() {
            AbstractC40913e.this.mo70116a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C40914a() {
        }

        /* renamed from: a */
        public final C40914a mo70117a(int i, int i2) {
            this.f95726a.add(C89387v.m154943a(Integer.valueOf(i), Integer.valueOf(i2)));
            return this;
        }
    }

    /* renamed from: a */
    public final C40914a mo70115a() {
        return new C40914a();
    }

    public AbstractC40913e(Activity activity) {
        C89219l.m154719c(activity, "");
        this.f95725a = activity;
    }
}
