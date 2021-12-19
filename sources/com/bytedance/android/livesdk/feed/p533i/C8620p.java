package com.bytedance.android.livesdk.feed.p533i;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.C11721e;
import com.bytedance.android.livesdkapi.host.AbstractC11806f;
import com.bytedance.android.livesdkapi.p673a.AbstractC11607a;
import com.bytedance.android.livesdkapi.p673a.AbstractC11608b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.i.p */
public final class C8620p extends AbstractC10937b<FeedItem> {

    /* renamed from: a */
    public FeedItem f21316a;

    /* renamed from: b */
    public boolean f21317b;

    /* renamed from: c */
    public boolean f21318c;

    /* renamed from: d */
    AbstractC11608b f21319d;

    /* renamed from: e */
    protected final AbstractC8593h f21320e;

    /* renamed from: f */
    protected final FeedDataKey f21321f;

    /* renamed from: g */
    private HSImageView f21322g;

    /* renamed from: h */
    private TextView f21323h;

    /* renamed from: i */
    private TextView f21324i;

    /* renamed from: j */
    private TextView f21325j;

    /* renamed from: k */
    private ImageView f21326k;

    /* renamed from: l */
    private int f21327l = -1;

    /* renamed from: m */
    private View f21328m;

    /* renamed from: n */
    private boolean f21329n;

    /* renamed from: o */
    private boolean f21330o;

    /* renamed from: p */
    private AbstractC11607a f21331p;

    /* renamed from: q */
    private C88960c<Object> f21332q;

    /* renamed from: r */
    private C88960c<Object> f21333r;

    static {
        Covode.recordClassIndex(9477);
    }

    /* renamed from: f */
    private void m16877f() {
        C6193a.m13435a(AbstractC11806f.class);
        this.itemView.getContext();
        this.itemView.hashCode();
    }

    /* renamed from: g */
    private void m16878g() {
        FeedItem feedItem;
        if (this.f21319d != null && (feedItem = this.f21316a) != null && feedItem.item != null && (this.f21316a.item instanceof C11721e)) {
            ((C11721e) this.f21316a.item).mo18698a();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final void mo14823a() {
        super.mo14823a();
        FeedItem feedItem = this.f21316a;
        if (!(feedItem == null || feedItem.item == null || !(this.f21316a.item instanceof C11721e))) {
            C11721e eVar = (C11721e) this.f21316a.item;
            C6193a.m13435a(AbstractC11806f.class);
            this.itemView.getContext();
            eVar.getId();
            eVar.mo18699a("");
            C6193a.m13435a(AbstractC11806f.class);
            this.itemView.getContext();
            Object[] objArr = new Object[2];
            JSONObject jSONObject = this.f21316a.adJSONObject;
        }
        m16878g();
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: e */
    public final void mo14840e() {
        super.mo14840e();
        if (this.f21316a != null) {
            C6193a.m13435a(AbstractC11806f.class);
            this.itemView.getContext();
            this.itemView.hashCode();
        }
        if (this.f21330o) {
            this.f21330o = false;
            if (this.f21316a != null) {
                C6193a.m13435a(AbstractC11806f.class);
                this.itemView.getContext();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: b */
    public final void mo14824b() {
        FeedItem feedItem;
        super.mo14824b();
        if (this.f21319d != null && (feedItem = this.f21316a) != null && feedItem.item != null && (this.f21316a.item instanceof C11721e)) {
            C11721e eVar = (C11721e) this.f21316a.item;
            try {
                AbstractC11608b bVar = this.f21319d;
                eVar.mo18698a();
                JSONObject a = bVar.mo18407a();
                JSONObject a2 = eVar.mo18699a("");
                if (a != null) {
                    long optLong = a.optLong("duration", 0);
                    a.put("play_50", a.optLong("play_100", 0));
                    a.remove("duration");
                    a2.put("duration", optLong);
                    a2.put("ad_extra_data", a);
                }
                C6193a.m13435a(AbstractC11806f.class);
                this.itemView.getContext();
                eVar.getId();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo14925d() {
        m16877f();
        m16878g();
        if (this.f21317b) {
            this.f21320e.mo14831a(this.f21321f, String.valueOf(this.f21316a.item.getId()));
            C11226ao.m19882a(this.itemView.getContext(), (int) R.string.gkm);
            this.f21317b = false;
            this.f21317b = false;
        }
        if (this.f21318c) {
            C6193a.m13435a(AbstractC11806f.class);
            this.itemView.getContext();
        }
        if (this.f21319d != null) {
            ((C11721e) this.f21316a.item).mo18698a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14923a(FeedItem feedItem) {
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof C11721e)) {
            C6193a.m13435a(AbstractC11806f.class);
            this.itemView.getContext();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14922a(PopupWindow popupWindow) {
        this.f21320e.mo14831a(this.f21321f, String.valueOf(this.f21316a.item.getId()));
        C6193a.m13435a(AbstractC11806f.class);
        this.itemView.getContext();
        C11226ao.m19882a(this.itemView.getContext(), (int) R.string.gkm);
        popupWindow.dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14924a(String str) {
        FeedItem feedItem = this.f21316a;
        if (feedItem != null && feedItem.item != null && (this.f21316a.item instanceof C11721e)) {
            C11721e eVar = (C11721e) this.f21316a.item;
            if (eVar.f28012b.equals("app")) {
                C6193a.m13435a(AbstractC11806f.class);
                this.itemView.getContext();
                return;
            }
            eVar.mo18699a(str);
            C6193a.m13435a(AbstractC11806f.class);
            this.itemView.getContext();
            eVar.getId();
            C6193a.m13435a(AbstractC11806f.class);
            this.itemView.getContext();
            Object[] objArr = new Object[2];
            JSONObject jSONObject = this.f21316a.adJSONObject;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final /* synthetic */ void mo9329a(FeedItem feedItem, int i) {
        FeedItem feedItem2 = feedItem;
        this.f21316a = feedItem2;
        if (!this.f21330o) {
            this.f21330o = true;
            if (feedItem2 != null) {
                C6193a.m13435a(AbstractC11806f.class);
                this.itemView.getContext();
                Object[] objArr = new Object[1];
                new Object() {
                    /* class com.bytedance.android.livesdk.feed.p533i.C8620p.C86211 */

                    static {
                        Covode.recordClassIndex(9478);
                    }
                };
            }
        }
        if (this.f21327l <= 0) {
            this.f21327l = C13628n.m24504a(this.f21322g.getContext());
        }
        HSImageView hSImageView = this.f21322g;
        int i2 = this.f21327l;
        hSImageView.setLayoutParams(new RelativeLayout.LayoutParams(i2, i2));
        if (feedItem2 != null && (feedItem2.item instanceof C11721e)) {
            C11721e eVar = (C11721e) feedItem2.item;
            this.f21323h.setOnClickListener(new View$OnClickListenerC8623r(this, feedItem2));
            this.itemView.setOnClickListener(new View$OnClickListenerC8625t(this, feedItem2));
            if (this.f21329n) {
                this.itemView.setOnLongClickListener(new View$OnLongClickListenerC8626u(this));
            } else {
                this.itemView.setOnLongClickListener(null);
            }
            this.f21328m.setOnClickListener(new View$OnClickListenerC8627v(this, feedItem2));
            if (!C13603b.m24435a((Collection) eVar.f28014d) && eVar.f28014d.get(0) != null && !C13603b.m24435a((Collection) eVar.f28014d.get(0).f28041c)) {
                this.f21322g.setImageURI(eVar.f28014d.get(0).f28041c.get(0));
            }
            if (!TextUtils.isEmpty(eVar.f28000A)) {
                this.f21323h.setText(eVar.f28000A);
                this.f21323h.setVisibility(0);
            } else {
                this.f21323h.setVisibility(8);
            }
            if (!TextUtils.isEmpty(eVar.f28001B)) {
                this.f21325j.setText(eVar.f28001B);
            }
            this.f21324i.setText(eVar.f28025o);
            m16877f();
            C88960c<Object> cVar = this.f21332q;
            if (cVar != null) {
                mo17797a(cVar.mo143254a(new C8628w(this), C8629x.f21346a));
            }
            C88960c<Object> cVar2 = this.f21333r;
            if (cVar2 != null) {
                mo17797a(cVar2.mo143254a(new C8630y(this), C8631z.f21348a));
            }
        }
    }

    public C8620p(View view, AbstractC8593h hVar, FeedDataKey feedDataKey, AbstractC8643m mVar, C88960c<Object> cVar, C88960c<Object> cVar2) {
        super(view);
        boolean z;
        this.f21322g = (HSImageView) view.findViewById(R.id.bsb);
        this.f21323h = (TextView) view.findViewById(R.id.title);
        this.f21324i = (TextView) view.findViewById(R.id.erz);
        this.f21326k = (ImageView) view.findViewById(R.id.bx7);
        this.f21328m = view.findViewById(R.id.ga);
        this.f21325j = (TextView) view.findViewById(R.id.en);
        this.f21331p = new C8622q(this);
        if (feedDataKey == null || mVar == null || !mVar.mo14950b(feedDataKey.f21208c)) {
            z = false;
        } else {
            z = true;
        }
        this.f21329n = z;
        this.f21320e = hVar;
        this.f21321f = feedDataKey;
        this.f21332q = cVar;
        this.f21333r = cVar2;
        this.f21319d = ((AbstractC11806f) C6193a.m13435a(AbstractC11806f.class)).mo18864a();
    }
}
