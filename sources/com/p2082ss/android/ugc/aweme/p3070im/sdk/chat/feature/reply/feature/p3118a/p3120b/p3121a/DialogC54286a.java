package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3121a;

import android.content.ClipboardManager;
import android.content.Context;
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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0240h;
import androidx.p025c.C0484a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3119a.C54283a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55172ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56255h;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a */
public final class DialogC54286a extends DialogC0240h {

    /* renamed from: a */
    public final C56255h f124349a;

    /* renamed from: b */
    public final AbstractC54290a f124350b;

    /* renamed from: c */
    public final AbstractC54290a f124351c;

    /* renamed from: d */
    public EditText f124352d;

    /* renamed from: e */
    private View f124353e;

    /* renamed from: f */
    private TextView f124354f;

    /* renamed from: g */
    private AvatarImageView f124355g;

    /* renamed from: h */
    private ImageView f124356h;

    /* renamed from: i */
    private TextView f124357i;

    /* renamed from: j */
    private Button f124358j;

    /* renamed from: k */
    private Button f124359k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a$a */
    public interface AbstractC54290a {
        static {
            Covode.recordClassIndex(63984);
        }

        /* renamed from: a */
        void mo91377a(String str);
    }

    static {
        Covode.recordClassIndex(63980);
    }

    public final void cancel() {
        m99565b();
        super.cancel();
    }

    public final void dismiss() {
        m99565b();
        super.dismiss();
    }

    public final void show() {
        super.show();
        C39115e.m79413a(this.f124352d);
    }

    /* renamed from: b */
    private void m99565b() {
        InputMethodManager inputMethodManager = (InputMethodManager) m99564a(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f124352d.getWindowToken(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a$b */
    public static class C54291b {

        /* renamed from: a */
        public Context f124363a;

        /* renamed from: b */
        public C56255h f124364b;

        /* renamed from: c */
        public AbstractC54290a f124365c;

        /* renamed from: d */
        public AbstractC54290a f124366d;

        static {
            Covode.recordClassIndex(63985);
        }

        public C54291b(Context context) {
            this.f124363a = context;
        }
    }

    private DialogC54286a(C54291b bVar) {
        super(bVar.f124363a);
        this.f124349a = bVar.f124364b;
        this.f124350b = bVar.f124365c;
        this.f124351c = bVar.f124366d;
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(3933);
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a4f, (ViewGroup) null);
        this.f124353e = inflate;
        setContentView(inflate);
        setCancelable(false);
        this.f124354f = (TextView) findViewById(R.id.a8w);
        this.f124355g = (AvatarImageView) findViewById(R.id.ol);
        this.f124356h = (ImageView) findViewById(R.id.fbe);
        this.f124357i = (TextView) findViewById(R.id.fa1);
        this.f124352d = (EditText) findViewById(R.id.aru);
        this.f124358j = (Button) findViewById(R.id.dxg);
        this.f124359k = (Button) findViewById(R.id.dxm);
        IMUser iMUser = this.f124349a.f128308h;
        this.f124354f.setText(getContext().getResources().getString(R.string.cdd, this.f124349a.f128307g));
        C34577e.m70592a(this.f124355g, iMUser.getAvatarThumb());
        this.f124357i.setText(iMUser.getNickName());
        C80581io.m139704a(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f124357i);
        C55173ae.m100882a(this.f124358j);
        C55173ae.m100882a(this.f124359k);
        this.f124358j.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3121a.DialogC54286a.View$OnClickListenerC542871 */

            static {
                Covode.recordClassIndex(63981);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (DialogC54286a.this.f124350b != null) {
                    DialogC54286a.this.f124350b.mo91377a(DialogC54286a.this.f124352d.getText().toString());
                }
                DialogC54286a.this.dismiss();
            }
        });
        this.f124359k.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3121a.DialogC54286a.View$OnClickListenerC542882 */

            static {
                Covode.recordClassIndex(63982);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (TextUtils.isEmpty(DialogC54286a.this.f124352d.getText().toString())) {
                    new C23144b(DialogC54286a.this).mo37640e(R.string.ccy).mo37637b();
                    C54283a.m99563a(DialogC54286a.this.f124349a.f128305e);
                } else if (DialogC54286a.this.f124352d.getText().length() > 6000) {
                    new C23144b(view).mo37635a(C17867d.m33078a().getResources().getString(R.string.cey)).mo37637b();
                    C54283a.m99563a(DialogC54286a.this.f124349a.f128305e);
                } else {
                    C56255h hVar = DialogC54286a.this.f124349a;
                    C54283a.C54285b bVar = C54283a.C54285b.f124348a;
                    C89219l.m154721d(hVar, "");
                    C89219l.m154721d(bVar, "");
                    C0484a aVar = new C0484a();
                    String str = hVar.f128305e;
                    C89219l.m154716b(str, "");
                    aVar.put("enter_from", str);
                    String str2 = hVar.f128303c;
                    C89219l.m154716b(str2, "");
                    aVar.put("group_id", str2);
                    String str3 = hVar.f128302b;
                    C89219l.m154716b(str3, "");
                    aVar.put("comment_id", str3);
                    IMUser iMUser = hVar.f128308h;
                    C89219l.m154716b(iMUser, "");
                    String uid = iMUser.getUid();
                    C89219l.m154716b(uid, "");
                    aVar.put("to_user_id", uid);
                    String str4 = hVar.f128304d;
                    C89219l.m154716b(str4, "");
                    aVar.put("author_id", str4);
                    bVar.invoke("share_comment", aVar);
                    if (DialogC54286a.this.f124351c != null) {
                        DialogC54286a.this.f124351c.mo91377a(DialogC54286a.this.f124352d.getText().toString());
                    }
                    DialogC54286a.this.dismiss();
                }
            }
        });
        this.f124352d.setFilters(new InputFilter[]{new C55172ad(this.f124352d)});
        this.f124352d.setOnKeyListener(new View.OnKeyListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3121a.DialogC54286a.View$OnKeyListenerC542893 */

            static {
                Covode.recordClassIndex(63983);
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return i == 66;
            }
        });
        MethodCollector.m26664o(3933);
    }

    public /* synthetic */ DialogC54286a(C54291b bVar, byte b) {
        this(bVar);
    }

    /* renamed from: a */
    private static Object m99564a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3942);
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
                    MethodCollector.m26664o(3942);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
