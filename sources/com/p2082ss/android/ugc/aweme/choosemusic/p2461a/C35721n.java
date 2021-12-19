package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.n */
public final class C35721n extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final TextView f84266a;

    /* renamed from: b */
    final ImageView f84267b;

    /* renamed from: c */
    private final View f84268c;

    static {
        Covode.recordClassIndex(42953);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35721n(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.a5y);
        C89219l.m154716b(findViewById, "");
        this.f84268c = findViewById;
        View findViewById2 = view.findViewById(R.id.ezs);
        C89219l.m154716b(findViewById2, "");
        this.f84266a = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bgs);
        C89219l.m154716b(findViewById3, "");
        this.f84267b = (ImageView) findViewById3;
        if (Build.VERSION.SDK_INT >= 23) {
            findViewById.setForeground(findViewById.getResources().getDrawable(R.drawable.bmh));
        } else {
            C62023a.m112168a(findViewById);
        }
    }
}
