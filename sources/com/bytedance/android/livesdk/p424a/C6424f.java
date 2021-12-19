package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p405s.AbstractC6100b;
import com.bytedance.android.live.p405s.AbstractC6101c;
import com.bytedance.android.live.p405s.AbstractC6105g;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.android.livesdk.event.C8462o;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.a.f */
public final class C6424f extends RecyclerView.ViewHolder implements AbstractC6100b, AbstractC6101c, AbstractC6105g {

    /* renamed from: a */
    VHeadView f16005a;

    /* renamed from: b */
    TextView f16006b;

    /* renamed from: c */
    View f16007c;

    /* renamed from: d */
    View f16008d;

    /* renamed from: e */
    TextView f16009e;

    /* renamed from: f */
    TextView f16010f;

    /* renamed from: g */
    public HSImageView f16011g;

    /* renamed from: h */
    Context f16012h;

    /* renamed from: i */
    List<User> f16013i = new ArrayList();

    /* renamed from: j */
    String f16014j;

    /* renamed from: k */
    User f16015k;

    /* renamed from: l */
    long f16016l;

    /* renamed from: m */
    long f16017m;

    /* renamed from: n */
    private AbstractC6419b f16018n;

    static {
        Covode.recordClassIndex(7160);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: a */
    public final void mo11962a() {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: a */
    public final void mo11758a(C6099c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: b */
    public final void mo11964b(C6099c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: c */
    public final void mo11762c() {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: d */
    public final void mo11966d() {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: k_ */
    public final void mo11763k_() {
    }

    /* renamed from: e */
    public static boolean m13821e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Map<String, String> mo12581f() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f16017m));
        hashMap.put("room_id", String.valueOf(this.f16016l));
        return hashMap;
    }

    /* renamed from: a */
    static String m13820a(User user) {
        if (user == null) {
            return null;
        }
        return C6581g.m14075a(user);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6105g
    /* renamed from: a */
    public final void mo11759a(Exception exc) {
        this.f16006b.setVisibility(0);
        this.f16008d.setVisibility(8);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6105g
    /* renamed from: a */
    public final void mo11761a(boolean z) {
        if (!z) {
            C6420c cVar = new C6420c(this.f16015k.getId());
            C6779a.m14563a().mo13053a(cVar);
            AbstractC6419b bVar = this.f16018n;
            if (bVar != null) {
                bVar.mo12577a(cVar);
            }
            this.f16006b.setVisibility(0);
            this.f16008d.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: b */
    public final void mo11965b(boolean z) {
        if (!z) {
            this.f16006b.setVisibility(0);
            this.f16008d.setVisibility(8);
            C8462o oVar = new C8462o(false, this.f16015k.getId());
            AbstractC6419b bVar = this.f16018n;
            if (bVar != null) {
                bVar.mo12578a(oVar);
            }
            C6779a.m14563a().mo13053a(oVar);
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: a */
    public final void mo11963a(boolean z, Exception exc) {
        if (!z) {
            this.f16006b.setVisibility(0);
            this.f16008d.setVisibility(8);
            C11264f.m19957a(this.f16012h, exc);
        }
    }

    public C6424f(Context context, View view, String str, long j, long j2, AbstractC6419b bVar) {
        super(view);
        this.f16005a = (VHeadView) view.findViewById(R.id.be7);
        this.f16006b = (TextView) view.findViewById(R.id.a0z);
        this.f16008d = view.findViewById(R.id.a16);
        this.f16009e = (TextView) view.findViewById(R.id.csj);
        this.f16010f = (TextView) view.findViewById(R.id.fa1);
        this.f16011g = (HSImageView) view.findViewById(R.id.f_l);
        this.f16007c = view.findViewById(R.id.a14);
        this.f16012h = context;
        this.f16014j = str;
        this.f16016l = j;
        this.f16017m = j2;
        this.f16018n = bVar;
    }
}
