package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.b */
public final class C44996b extends ConstraintLayout {

    /* renamed from: g */
    private SparseArray f104978g;

    static {
        Covode.recordClassIndex(53419);
    }

    /* renamed from: b */
    private View m87683b(int i) {
        if (this.f104978g == null) {
            this.f104978g = new SparseArray();
        }
        View view = (View) this.f104978g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104978g.put(i, findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44996b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.pz, this, true);
    }

    public final void setDesc(String str) {
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) m87683b(R.id.ajd);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(str);
        }
    }

    public final void setIcon(Image image) {
        if (image != null) {
            C20766v a = C20761r.m39058a(image.toImageUrlModel());
            a.f49115l = R.color.v;
            a.f49093F = (ImageView) m87683b(R.id.bh1);
            a.mo34186c();
        }
    }

    public final void setTitle(String str) {
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) m87683b(R.id.title);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(str);
        }
    }

    public /* synthetic */ C44996b(Context context, byte b) {
        this(context);
    }
}
