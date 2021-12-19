package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0240h;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55172ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55178af;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a */
public final class DialogC55319a extends DialogC0240h {

    /* renamed from: a */
    public final C55949a.AbstractC55950a f126483a;

    /* renamed from: b */
    public final C55949a.AbstractC55950a f126484b;

    /* renamed from: c */
    public TextView f126485c;

    /* renamed from: d */
    public EditText f126486d;

    /* renamed from: e */
    public SharePackage f126487e;

    /* renamed from: f */
    public Context f126488f;

    /* renamed from: g */
    private final IMUser[] f126489g;

    /* renamed from: h */
    private final IMContact[] f126490h;

    /* renamed from: i */
    private RemoteImageView f126491i;

    /* renamed from: j */
    private ViewGroup f126492j;

    /* renamed from: k */
    private TextView f126493k;

    /* renamed from: l */
    private Button f126494l;

    /* renamed from: m */
    private Button f126495m;

    /* renamed from: n */
    private View f126496n;

    /* renamed from: o */
    private String f126497o;

    static {
        Covode.recordClassIndex(65084);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a$a */
    public static class C55324a {

        /* renamed from: a */
        public Context f126502a;

        /* renamed from: b */
        public IMContact[] f126503b;

        /* renamed from: c */
        public IMUser[] f126504c;

        /* renamed from: d */
        public SharePackage f126505d;

        /* renamed from: e */
        public C55949a.AbstractC55950a f126506e;

        /* renamed from: f */
        public C55949a.AbstractC55950a f126507f;

        /* renamed from: g */
        public String f126508g;

        /* renamed from: h */
        private int f126509h;

        /* renamed from: i */
        private int f126510i;

        static {
            Covode.recordClassIndex(65089);
        }

        /* renamed from: c */
        public final DialogC55319a mo92394c() {
            return new DialogC55319a(this, (byte) 0);
        }

        /* renamed from: a */
        public final C55324a mo92390a() {
            this.f126509h = C51428b.m95803a(this.f126502a, 416.0f);
            return this;
        }

        /* renamed from: b */
        public final C55324a mo92393b() {
            this.f126510i = C51428b.m95803a(this.f126502a, 335.0f);
            return this;
        }

        public C55324a(Context context) {
            this.f126502a = context;
        }

        /* renamed from: a */
        public final C55324a mo92391a(String str) {
            if (str == null) {
                str = "";
            }
            this.f126508g = str;
            return this;
        }

        /* renamed from: a */
        public final C55324a mo92392a(IMContact[] iMContactArr) {
            this.f126503b = iMContactArr;
            this.f126504c = null;
            return this;
        }
    }

    public final void cancel() {
        m101129b();
        super.cancel();
    }

    public final void dismiss() {
        m101129b();
        super.dismiss();
    }

    /* renamed from: b */
    private void m101129b() {
        InputMethodManager inputMethodManager = (InputMethodManager) m101123a(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f126486d.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private static void m101125a(RemoteImageView remoteImageView) {
        C24250e eVar = ((C24246a) remoteImageView.getHierarchy()).f57470a;
        if (eVar != null) {
            eVar.f57500b = true;
            ((C24246a) remoteImageView.getHierarchy()).mo39959a(eVar);
        }
    }

    private DialogC55319a(C55324a aVar) {
        super(aVar.f126502a, R.style.yp);
        this.f126488f = aVar.f126502a;
        this.f126489g = aVar.f126504c;
        this.f126490h = aVar.f126503b;
        this.f126487e = aVar.f126505d;
        this.f126483a = aVar.f126506e;
        this.f126484b = aVar.f126507f;
        this.f126497o = aVar.f126508g;
    }

    /* renamed from: a */
    private <T extends IMContact> void m101127a(T[] tArr) {
        MethodCollector.m26663i(3047);
        this.f126492j.removeAllViews();
        if (tArr.length == 1) {
            this.f126493k.setText(R.string.ch7);
            this.f126495m.setText(R.string.ch4);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a8k, (ViewGroup) null);
            inflate.findViewById(R.id.fbe);
            TextView textView = (TextView) inflate.findViewById(R.id.fa1);
            T t = tArr[0];
            C55198a.m100927a((RemoteImageView) inflate.findViewById(R.id.ol), t.getDisplayAvatar());
            if (t instanceof IMUser) {
                textView.setText(t.getDisplayName());
                IMUser iMUser = (IMUser) t;
                C80581io.m139704a(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), textView);
            } else {
                textView.setText(t.getDisplayName());
                C80581io.m139704a(getContext(), "", "", textView);
            }
            this.f126492j.addView(inflate);
            MethodCollector.m26664o(3047);
            return;
        }
        this.f126493k.setText(R.string.cf_);
        int length = tArr.length;
        for (T t2 : tArr) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.a8j, (ViewGroup) null);
            C55198a.m100927a((RemoteImageView) inflate2.findViewById(R.id.ol), t2.getDisplayAvatar());
            m101124a((TuxIconView) inflate2.findViewById(R.id.fbe), t2);
            this.f126492j.addView(inflate2);
        }
        this.f126495m.setText(((Object) getContext().getResources().getText(R.string.ch4)) + "(" + length + ")");
        MethodCollector.m26664o(3047);
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(2925);
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        View inflate = LayoutInflater.from(this.f126488f).inflate(R.layout.a4h, (ViewGroup) null);
        this.f126496n = inflate;
        setContentView(inflate);
        setCancelable(false);
        this.f126493k = (TextView) findViewById(R.id.dvm);
        this.f126492j = (ViewGroup) findViewById(R.id.f_z);
        this.f126491i = (RemoteImageView) findViewById(R.id.dxr);
        this.f126485c = (TextView) findViewById(R.id.dz2);
        EditText editText = (EditText) findViewById(R.id.aru);
        this.f126486d = editText;
        editText.setText(this.f126497o);
        EditText editText2 = this.f126486d;
        editText2.setSelection(editText2.getText().length());
        this.f126494l = (Button) findViewById(R.id.dxg);
        this.f126495m = (Button) findViewById(R.id.dxm);
        C55173ae.m100882a(this.f126494l);
        C55173ae.m100882a(this.f126495m);
        this.f126494l.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.DialogC55319a.View$OnClickListenerC553201 */

            static {
                Covode.recordClassIndex(65085);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (DialogC55319a.this.f126483a != null) {
                    DialogC55319a.this.f126483a.mo92808a(DialogC55319a.this.f126486d.getText().toString());
                }
                DialogC55319a.this.dismiss();
            }
        });
        this.f126495m.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.DialogC55319a.View$OnClickListenerC553212 */

            static {
                Covode.recordClassIndex(65086);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (DialogC55319a.this.f126484b == null) {
                    return;
                }
                if (DialogC55319a.this.f126486d.getText().length() > 6000) {
                    new C23144b(view).mo37635a(C17867d.m33078a().getResources().getString(R.string.cey)).mo37637b();
                    return;
                }
                DialogC55319a.this.f126484b.mo92808a(DialogC55319a.this.f126486d.getText().toString());
                DialogC55319a.this.dismiss();
            }
        });
        if (TextUtils.equals("live_event", this.f126487e.f155487d)) {
            String string = this.f126487e.f155492i.getString("live_event_title");
            if (!TextUtils.isEmpty(string)) {
                this.f126485c.setText(C17867d.m33078a().getResources().getString(R.string.boz, string));
                this.f126485c.setVisibility(0);
            }
            this.f126491i.setVisibility(8);
        } else if (TextUtils.equals("text", this.f126487e.f155487d)) {
            String string2 = this.f126487e.f155492i.getString("share_text");
            this.f126485c.setText(string2);
            this.f126491i.setVisibility(8);
            this.f126485c.setVisibility(0);
            if (string2 != null && string2.length() <= 1024) {
                C46579b.m89899a(this.f126485c);
            }
        } else if (TextUtils.equals(UGCMonitor.EVENT_COMMENT, this.f126487e.f155487d)) {
            this.f126491i.setVisibility(0);
            this.f126485c.setVisibility(0);
            this.f126485c.setText(CommentSharePackage.m122321a(this.f126488f, this.f126487e.f155492i.getString("comment_author_name", ""), this.f126487e.f155492i.getString("comment_reply_user_name", ""), this.f126487e.f155492i.getString("comment_text", ""), BitmapFactory.decodeResource(this.f126488f.getResources(), 2131232818), (int) C13628n.m24520b(this.f126488f, 16.0f)));
            C20766v a = C20761r.m39060a(C34735v.m70965a((UrlModel) this.f126487e.f155492i.getSerializable("comment_author_avatar_url")));
            a.f49105b = this.f126488f;
            a.mo34179a("ImShareDialog").mo34182a(new AbstractC20728e() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.DialogC55319a.C553223 */

                static {
                    Covode.recordClassIndex(65087);
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
                /* renamed from: a */
                public final void mo34166a(Throwable th) {
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
                /* renamed from: a */
                public final void mo34165a(Bitmap bitmap) {
                    if (bitmap != null) {
                        DialogC55319a.this.f126485c.setText(CommentSharePackage.m122321a(DialogC55319a.this.f126488f, DialogC55319a.this.f126487e.f155492i.getString("comment_author_name", ""), DialogC55319a.this.f126487e.f155492i.getString("comment_reply_user_name", ""), DialogC55319a.this.f126487e.f155492i.getString("comment_text", ""), bitmap, (int) C13628n.m24520b(DialogC55319a.this.f126488f, 16.0f)));
                    }
                }
            });
            m101128a(this.f126491i, this.f126487e, (Boolean) true);
        } else {
            this.f126491i.setVisibility(0);
            this.f126485c.setVisibility(8);
            m101128a(this.f126491i, this.f126487e, (Boolean) true);
        }
        this.f126486d.setFilters(new InputFilter[]{new C55172ad(this.f126486d)});
        this.f126486d.setOnKeyListener(new View.OnKeyListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.DialogC55319a.View$OnKeyListenerC553234 */

            static {
                Covode.recordClassIndex(65088);
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return i == 66;
            }
        });
        IMUser[] iMUserArr = this.f126489g;
        if (iMUserArr != null && iMUserArr.length > 0) {
            m101127a(iMUserArr);
        }
        IMContact[] iMContactArr = this.f126490h;
        if (iMContactArr == null || iMContactArr.length <= 0) {
            MethodCollector.m26664o(2925);
            return;
        }
        m101127a(iMContactArr);
        MethodCollector.m26664o(2925);
    }

    /* synthetic */ DialogC55319a(C55324a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    private static <T extends IMContact> void m101124a(TuxIconView tuxIconView, T t) {
        C55178af.m100885a(tuxIconView, C55083f.m100745a(t));
    }

    /* renamed from: a */
    private static Object m101123a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3054);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3054);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static void m101126a(RemoteImageView remoteImageView, Serializable serializable, int i) {
        if (serializable instanceof UrlModel) {
            C55198a.m100927a(remoteImageView, (UrlModel) serializable);
        } else {
            C34577e.m70591a(remoteImageView, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        if (r4.equals("aweme") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0135, code lost:
        if (r4.equals("web") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01fc, code lost:
        if (r4.equals("search") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0204, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0206, code lost:
        com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a.m100935a(r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020b, code lost:
        com.p2082ss.android.ugc.aweme.base.C34577e.m70591a(r8, 2131232907);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0219, code lost:
        if (r4.equals("story_video") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021d, code lost:
        m101126a(r8, r2, (int) com.p2082ss.android.ugc.trill.R.color.v);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0237 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m101128a(com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView r8, com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage r9, java.lang.Boolean r10) {
        /*
        // Method dump skipped, instructions count: 630
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.DialogC55319a.m101128a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.sharer.ui.SharePackage, java.lang.Boolean):boolean");
    }
}
