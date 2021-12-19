package com.bytedance.android.livesdk.chatroom;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.p176b.C2943o;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6955c;
import com.bytedance.android.livesdk.chatroom.p488c.C7370ac;
import com.bytedance.android.livesdk.chatroom.p488c.C7377aj;
import com.bytedance.android.livesdk.chatroom.p488c.C7386e;
import com.bytedance.android.livesdk.model.C9533aq;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p559i.AbstractC8973a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.a */
public final class C7260a extends C2943o {

    /* renamed from: b */
    public final C9533aq f18062b;

    /* renamed from: c */
    private final C88411a f18063c;

    /* renamed from: d */
    private View f18064d;

    /* renamed from: e */
    private ImageView f18065e;

    /* renamed from: f */
    private final String f18066f;

    /* renamed from: g */
    private final AbstractC8973a f18067g;

    static {
        Covode.recordClassIndex(8011);
    }

    @Override // com.bytedance.android.live.p176b.C2943o
    /* renamed from: a */
    public final int mo7706a() {
        return R.layout.bda;
    }

    private /* synthetic */ C7260a() {
        this(null, null, null);
    }

    @Override // com.bytedance.android.live.p176b.C2943o
    /* renamed from: d */
    public final void mo7710d() {
        super.mo7710d();
        AbstractC8973a aVar = this.f18067g;
        if (aVar != null) {
            aVar.mo14336a();
        }
    }

    @Override // com.bytedance.android.live.p176b.C2943o
    /* renamed from: c */
    public final void mo7709c() {
        super.mo7709c();
        if (!this.f18063c.isDisposed()) {
            this.f18063c.dispose();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    @Override // com.bytedance.android.live.p176b.C2943o
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7708b() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.C7260a.mo7708b():void");
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a$a */
    static final class View$OnClickListenerC7261a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7260a f18068a;

        static {
            Covode.recordClassIndex(8012);
        }

        View$OnClickListenerC7261a(C7260a aVar) {
            this.f18068a = aVar;
        }

        public final void onClick(View view) {
            AbstractC6955c cVar = this.f18068a.f8684a;
            if (cVar != null) {
                cVar.mo13241b();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a$d */
    static final class C7264d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7260a f18072a;

        static {
            Covode.recordClassIndex(8015);
        }

        C7264d(C7260a aVar) {
            this.f18072a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC6955c cVar = this.f18072a.f8684a;
            if (cVar != null) {
                cVar.mo13241b();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a$e */
    static final class C7265e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7260a f18073a;

        static {
            Covode.recordClassIndex(8016);
        }

        C7265e(C7260a aVar) {
            this.f18073a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC6955c cVar = this.f18073a.f8684a;
            if (cVar != null) {
                cVar.mo13241b();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a$b */
    static final class View$OnClickListenerC7262b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7260a f18069a;

        /* renamed from: b */
        final /* synthetic */ WebView f18070b;

        static {
            Covode.recordClassIndex(8013);
        }

        View$OnClickListenerC7262b(C7260a aVar, WebView webView) {
            this.f18069a = aVar;
            this.f18070b = webView;
        }

        public final void onClick(View view) {
            if (this.f18070b.canGoBack()) {
                this.f18070b.goBack();
                return;
            }
            AbstractC6955c cVar = this.f18069a.f8684a;
            if (cVar != null) {
                cVar.mo13241b();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a$c */
    static final class View$OnClickListenerC7263c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7260a f18071a;

        static {
            Covode.recordClassIndex(8014);
        }

        View$OnClickListenerC7263c(C7260a aVar) {
            this.f18071a = aVar;
        }

        public final void onClick(View view) {
            C6779a.m14563a().mo13053a(new C7370ac(this.f18071a.f18062b));
        }
    }

    @Override // com.bytedance.android.live.p176b.C2943o
    /* renamed from: a */
    public final void mo7707a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo7707a(view, bundle);
        this.f18064d = view.findViewById(R.id.e8p);
        this.f18065e = (ImageView) view.findViewById(R.id.e8m);
        TextView textView = (TextView) view.findViewById(R.id.e8q);
        if (textView != null && this.f18062b != null) {
            textView.setOnClickListener(new View$OnClickListenerC7263c(this));
            this.f18063c.mo142945a(C6779a.m14563a().mo13052a(C7377aj.class).mo143289d(new C7264d(this)));
            this.f18063c.mo142945a(C6779a.m14563a().mo13052a(C7386e.class).mo143289d(new C7265e(this)));
        }
    }

    public C7260a(String str, C9533aq aqVar, AbstractC8973a aVar) {
        this.f18066f = str;
        this.f18062b = aqVar;
        this.f18067g = aVar;
        this.f18063c = new C88411a();
    }
}
