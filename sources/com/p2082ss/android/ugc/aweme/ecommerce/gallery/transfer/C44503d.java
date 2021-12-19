package com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.C44484a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a.C44490a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a.C44491b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d */
public final class C44503d {

    /* renamed from: a */
    public int f103745a;

    /* renamed from: b */
    public int f103746b;

    /* renamed from: c */
    public int f103747c;

    /* renamed from: d */
    public long f103748d;

    /* renamed from: e */
    public boolean f103749e;

    /* renamed from: f */
    public int f103750f;

    /* renamed from: g */
    public String f103751g;

    /* renamed from: h */
    public String f103752h;

    /* renamed from: i */
    public List<ImageView> f103753i;

    /* renamed from: j */
    public List<String> f103754j;

    /* renamed from: k */
    public List<String> f103755k;

    /* renamed from: l */
    public List<String> f103756l;

    /* renamed from: m */
    public C44490a f103757m;

    /* renamed from: n */
    public C44491b f103758n;

    /* renamed from: o */
    public String f103759o;

    /* renamed from: p */
    public boolean f103760p;

    /* renamed from: q */
    public boolean f103761q;

    /* renamed from: r */
    public AbstractC44505b f103762r;

    /* renamed from: s */
    public AbstractC44506c f103763s;

    /* renamed from: t */
    public View f103764t;

    /* renamed from: u */
    public int f103765u;

    /* renamed from: v */
    private AbstractC44487c f103766v;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d$a */
    public static class C44504a {

        /* renamed from: a */
        public int f103767a;

        /* renamed from: b */
        public int f103768b;

        /* renamed from: c */
        public int f103769c;

        /* renamed from: d */
        public long f103770d;

        /* renamed from: e */
        public boolean f103771e;

        /* renamed from: f */
        public String f103772f;

        /* renamed from: g */
        public String f103773g;

        /* renamed from: h */
        public List<String> f103774h;

        /* renamed from: i */
        public List<String> f103775i;

        /* renamed from: j */
        public List<String> f103776j;

        /* renamed from: k */
        public C44490a f103777k;

        /* renamed from: l */
        public C44491b f103778l;

        /* renamed from: m */
        public String f103779m;

        /* renamed from: n */
        public boolean f103780n;

        /* renamed from: o */
        public AbstractC44505b f103781o;

        /* renamed from: p */
        public boolean f103782p;

        /* renamed from: q */
        public View f103783q;

        /* renamed from: r */
        public AbstractC44506c f103784r;

        static {
            Covode.recordClassIndex(52854);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d$b */
    public interface AbstractC44505b {
        static {
            Covode.recordClassIndex(52855);
        }

        /* renamed from: a */
        void mo75518a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d$c */
    public interface AbstractC44506c {
        static {
            Covode.recordClassIndex(52856);
        }

        /* renamed from: a */
        void mo75519a(int i);
    }

    static {
        Covode.recordClassIndex(52853);
    }

    /* renamed from: a */
    public final List<ImageView> mo75516a() {
        List<ImageView> list = this.f103753i;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: b */
    public final AbstractC44487c mo75517b() {
        if (this.f103766v == null) {
            this.f103766v = new C44484a();
        }
        return this.f103766v;
    }

    /* renamed from: a */
    public final Drawable mo75515a(Context context) {
        if (this.f103746b != 0) {
            return context.getResources().getDrawable(this.f103746b);
        }
        return null;
    }
}
