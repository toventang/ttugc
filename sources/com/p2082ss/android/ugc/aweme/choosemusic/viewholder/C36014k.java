package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.k */
public final class C36014k extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public int f85044a;

    /* renamed from: b */
    SmartImageView f85045b;

    /* renamed from: c */
    protected Banner f85046c;

    /* renamed from: d */
    private int f85047d;

    /* renamed from: e */
    private int[] f85048e = new int[2];

    /* renamed from: f */
    private int f85049f;

    static {
        Covode.recordClassIndex(43260);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.k$a */
    class View$OnAttachStateChangeListenerC36015a implements View.OnAttachStateChangeListener, Runnable {

        /* renamed from: b */
        private boolean f85051b;

        static {
            Covode.recordClassIndex(43261);
        }

        /* renamed from: a */
        private void m73445a() {
            this.f85051b = false;
            C36014k.this.itemView.removeCallbacks(this);
        }

        public final void run() {
            boolean z;
            Banner banner = C36014k.this.f85046c;
            Rect rect = new Rect();
            if (!C36014k.m73442a(C36014k.this.itemView) || !C36014k.this.itemView.getGlobalVisibleRect(rect) || rect.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (banner != null) {
                if (z && !this.f85051b) {
                    C39162r.m79460a("banner_show", new C33744d().mo59983a("enter_from", "change_music_page").mo59983a("banner_id", C36014k.this.f85046c.getBid()).mo59983a("client_order", Integer.toString(C36014k.this.f85044a)).f79943a);
                }
                this.f85051b = z;
            }
            C36014k.this.itemView.postDelayed(this, 250);
        }

        public final void onViewDetachedFromWindow(View view) {
            m73445a();
        }

        private View$OnAttachStateChangeListenerC36015a() {
        }

        public final void onViewAttachedToWindow(View view) {
            m73445a();
            run();
        }

        /* synthetic */ View$OnAttachStateChangeListenerC36015a(C36014k kVar, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo63173a() {
        String str;
        Banner banner = this.f85046c;
        if (banner != null && !TextUtils.isEmpty(banner.getSchema())) {
            String schema = this.f85046c.getSchema();
            String str2 = "";
            if (schema != null && schema.startsWith("aweme://assmusic/category/")) {
                if (!schema.contains("?")) {
                    str = schema + "?musicType=" + this.f85047d;
                } else {
                    str = schema + "&musicType=" + this.f85047d;
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(this.itemView.getContext(), str);
                buildRoute.withParam("sound_page_scene", this.f85049f).withParam("extra_music_from", "choose_music_with_banner");
                buildRoute.open(10086);
                String b = C36132v.m73608b(this.f85046c.getSchema(), StringSet.name);
                String bid = this.f85046c.getBid();
                List<String> a = C36132v.m73606a(str);
                if (!C13603b.m24435a((Collection) a) && a.size() >= 2) {
                    str2 = a.get(1);
                }
                C35936b.m73319a(b, "click_banner", bid, "change_music_page", str2);
            } else if (TextUtils.isEmpty(schema) || (!schema.startsWith("http://") && !schema.startsWith("https://"))) {
                String uuid = UUID.randomUUID().toString();
                SmartRouter.buildRoute(this.itemView.getContext(), this.f85046c.getSchema()).withParam("process_id", uuid).withParam("extra_music_from", "choose_music_with_banner").open(10086);
                List<String> a2 = C36132v.m73606a(this.f85046c.getSchema());
                if (!C13603b.m24435a((Collection) a2) && a2.size() > 1) {
                    C35936b.m73315a(new C35754b("change_music_page", str2, "click_banner", C35936b.f84812a), a2.get(1), true, uuid);
                }
            } else {
                try {
                    SmartRouter.buildRoute(this.itemView.getContext(), "aweme://webview/?url=" + URLEncoder.encode(schema, "UTF-8")).open(10086);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    return;
                }
            }
            C39162r.m79460a("banner_click", new C33744d().mo59983a("enter_from", "change_music_page").mo59983a("banner_id", this.f85046c.getBid()).mo59983a("client_order", Integer.toString(this.f85044a)).f79943a);
        }
    }

    /* renamed from: a */
    public static boolean m73442a(View view) {
        if (view == null || !C0792v.m2791y(view)) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() != 16908290) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo63174a(Banner banner, int i) {
        if (banner != null && banner != this.f85046c) {
            this.f85046c = banner;
            if (banner.getBannerUrl() != null && !C13603b.m24435a((Collection) this.f85046c.getBannerUrl().getUrlList())) {
                C20766v a = C20761r.m39060a(C34735v.m70965a(this.f85046c.getBannerUrl())).mo34185b(C80397em.m139369a(601)).mo34180a(this.f85048e);
                a.f49106c = true;
                C20766v a2 = a.mo34179a("MusicBannerViewHolder");
                a2.f49092E = this.f85045b;
                a2.mo34186c();
            }
            new C37591b((float) C34728n.m70946a(4.0d), this.itemView.getContext().getResources().getColor(R.color.o_)).setAlpha(76);
            this.f85044a = i + 1;
        }
    }

    public C36014k(View view, int i, int i2) {
        super(view);
        this.f85047d = i;
        this.f85049f = i2;
        View$OnAttachStateChangeListenerC36015a aVar = new View$OnAttachStateChangeListenerC36015a(this, (byte) 0);
        view.addOnAttachStateChangeListener(aVar);
        if (C0792v.m2791y(view)) {
            aVar.run();
        }
        this.f85045b = (SmartImageView) view.findViewById(R.id.dqg);
        View findViewById = view.findViewById(R.id.dqg);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC36016l(this));
        }
        this.f85048e[0] = C13628n.m24504a(view.getContext()) - ((int) (C13628n.m24520b(view.getContext(), 16.0f) * 2.0f));
        int[] iArr = this.f85048e;
        iArr[1] = (int) (((float) iArr[0]) * 0.26239067f);
    }
}
