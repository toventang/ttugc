package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.c */
public final class C8932c extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C8933a f22007b = new C8933a((byte) 0);

    /* renamed from: a */
    final LiveLoadingView f22008a;

    static {
        Covode.recordClassIndex(9824);
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.c$a */
    public static final class C8933a {
        static {
            Covode.recordClassIndex(9825);
        }

        private C8933a() {
        }

        public /* synthetic */ C8933a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8932c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cf7);
        C89219l.m154716b(findViewById, "");
        this.f22008a = (LiveLoadingView) findViewById;
    }
}
