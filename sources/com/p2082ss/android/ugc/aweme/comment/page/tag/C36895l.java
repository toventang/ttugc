package com.p2082ss.android.ugc.aweme.comment.page.tag;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.l */
public final class C36895l extends ConstraintLayout {

    /* renamed from: g */
    public static final C36896a f86894g = new C36896a((byte) 0);

    /* renamed from: h */
    private String f86895h;

    /* renamed from: i */
    private SparseArray f86896i;

    static {
        Covode.recordClassIndex(44233);
    }

    /* renamed from: b */
    public final View mo9603b(int i) {
        if (this.f86896i == null) {
            this.f86896i = new SparseArray();
        }
        View view = (View) this.f86896i.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f86896i.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.l$a */
    public static final class C36896a {
        static {
            Covode.recordClassIndex(44234);
        }

        private C36896a() {
        }

        public /* synthetic */ C36896a(byte b) {
            this();
        }
    }

    public final String getCloseType() {
        return this.f86895h;
    }

    public final void setCloseType(String str) {
        C89219l.m154721d(str, "");
        this.f86895h = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C36895l(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9381);
        View.inflate(context, R.layout.jd, this);
        this.f86895h = "other";
        MethodCollector.m26664o(9381);
    }

    public /* synthetic */ C36895l(Context context, byte b) {
        this(context);
    }
}
