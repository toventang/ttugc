package com.p2082ss.android.ugc.aweme.following.p3003ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63973ae;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.following.ui.f */
public final class C51221f extends RecyclerView.ViewHolder {

    /* renamed from: a */
    User f118145a;

    /* renamed from: b */
    RecyclerView f118146b;

    /* renamed from: c */
    TextView f118147c;

    /* renamed from: d */
    boolean f118148d;

    /* renamed from: e */
    private boolean f118149e;

    /* renamed from: f */
    private Context f118150f;

    /* renamed from: g */
    private C51273o f118151g;

    /* renamed from: h */
    private int f118152h;

    /* renamed from: i */
    private List<FollowerDetail> f118153i;

    static {
        Covode.recordClassIndex(60425);
    }

    public C51221f(View view, C51273o oVar) {
        super(view);
        int size;
        this.f118146b = (RecyclerView) view.findViewById(R.id.az9);
        this.f118147c = (TextView) view.findViewById(R.id.ew1);
        this.f118150f = view.getContext();
        this.f118151g = oVar;
        this.f118145a = oVar.getUser();
        this.f118149e = oVar.isMine();
        User user = this.f118145a;
        if (user != null) {
            this.f118153i = C63973ae.m115688a(user.getFollowerDetailList());
        }
        if (C13603b.m24435a((Collection) this.f118153i)) {
            size = 0;
        } else {
            size = this.f118153i.size() + 3;
        }
        this.f118152h = size;
    }
}
