package com.facebook.login.p1906a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.AbstractC24150d;
import com.facebook.AbstractC24309g;
import com.facebook.AccessToken;
import com.facebook.C24012b;
import com.facebook.C24872m;
import com.facebook.C25031w;
import com.facebook.Profile;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24739e;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.C24776s;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.login.EnumC24862b;
import com.facebook.login.EnumC24864d;
import com.facebook.login.LoginManager;
import com.facebook.login.p1906a.C24856b;
import com.facebook.p1814a.C23998m;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.login.a.a */
public class C24847a extends AbstractC24309g {

    /* renamed from: f */
    private static final String f58977f = C24847a.class.getName();

    /* renamed from: c */
    public boolean f58978c;

    /* renamed from: d */
    public C24852a f58979d = new C24852a();

    /* renamed from: e */
    public String f58980e = "fb_login_view_usage";

    /* renamed from: g */
    private String f58981g;

    /* renamed from: h */
    private String f58982h;

    /* renamed from: i */
    private boolean f58983i;

    /* renamed from: j */
    private C24856b.EnumC24861b f58984j = C24856b.EnumC24861b.BLUE;

    /* renamed from: k */
    private EnumC24855c f58985k;

    /* renamed from: l */
    private long f58986l = 6000;

    /* renamed from: m */
    private C24856b f58987m;

    /* renamed from: n */
    private AbstractC24150d f58988n;

    /* renamed from: o */
    private LoginManager f58989o;

    @Override // com.facebook.AbstractC24309g
    public int getDefaultStyleResource() {
        return R.style.vk;
    }

    /* renamed from: com.facebook.login.a.a$c */
    public enum EnumC24855c {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static EnumC24855c DEFAULT;

        /* renamed from: a */
        private String f59004a;

        /* renamed from: b */
        private int f59005b;

        public final int getValue() {
            return this.f59005b;
        }

        public final String toString() {
            return this.f59004a;
        }

        static {
            EnumC24855c cVar;
            Covode.recordClassIndex(29044);
            DEFAULT = cVar;
        }

        public static EnumC24855c fromInt(int i) {
            EnumC24855c[] values = values();
            for (EnumC24855c cVar : values) {
                if (cVar.getValue() == i) {
                    return cVar;
                }
            }
            return null;
        }

        private EnumC24855c(String str, int i) {
            this.f59004a = str;
            this.f59005b = i;
        }
    }

    public long getToolTipDisplayTime() {
        return this.f58986l;
    }

    public EnumC24855c getToolTipMode() {
        return this.f58985k;
    }

    public String getAuthType() {
        return this.f58979d.f58999d;
    }

    public EnumC24862b getDefaultAudience() {
        return this.f58979d.f58996a;
    }

    public EnumC24864d getLoginBehavior() {
        return this.f58979d.f58998c;
    }

    /* access modifiers changed from: protected */
    public View$OnClickListenerC24853b getNewLoginClickListener() {
        return new View$OnClickListenerC24853b();
    }

    /* access modifiers changed from: package-private */
    public List<String> getPermissions() {
        return this.f58979d.f58997b;
    }

    static {
        Covode.recordClassIndex(29036);
    }

    /* renamed from: b */
    private void m47651b() {
        C24856b bVar = this.f58987m;
        if (bVar != null) {
            bVar.mo40757b();
            this.f58987m = null;
        }
    }

    public LoginManager getLoginManager() {
        if (this.f58989o == null) {
            this.f58989o = LoginManager.m47593a();
        }
        return this.f58989o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.login.a.a$a */
    public static class C24852a {

        /* renamed from: a */
        public EnumC24862b f58996a = EnumC24862b.FRIENDS;

        /* renamed from: b */
        public List<String> f58997b = Collections.emptyList();

        /* renamed from: c */
        public EnumC24864d f58998c = EnumC24864d.NATIVE_WITH_FALLBACK;

        /* renamed from: d */
        public String f58999d = "rerequest";

        static {
            Covode.recordClassIndex(29041);
        }

        C24852a() {
        }
    }

    @Override // com.facebook.AbstractC24309g
    public int getDefaultRequestCode() {
        if (C24677a.m47209a(this)) {
            return 0;
        }
        try {
            return C24739e.EnumC24741b.Login.toRequestCode();
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return 0;
        }
    }

    @Override // com.facebook.AbstractC24309g
    public void onAttachedToWindow() {
        if (!C24677a.m47209a(this)) {
            try {
                super.onAttachedToWindow();
                AbstractC24150d dVar = this.f58988n;
                if (dVar != null && !dVar.f57117b) {
                    this.f58988n.mo39736b();
                    mo40719a();
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public void onDetachedFromWindow() {
        if (!C24677a.m47209a(this)) {
            try {
                super.onDetachedFromWindow();
                AbstractC24150d dVar = this.f58988n;
                if (dVar != null) {
                    dVar.mo39737c();
                }
                m47651b();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: com.facebook.login.a.a$3 */
    static /* synthetic */ class C248513 {

        /* renamed from: a */
        static final /* synthetic */ int[] f58995a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 29040(0x7170, float:4.0694E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.login.a.a$c[] r0 = com.facebook.login.p1906a.C24847a.EnumC24855c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.login.p1906a.C24847a.C248513.f58995a = r2
                com.facebook.login.a.a$c r0 = com.facebook.login.p1906a.C24847a.EnumC24855c.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.login.p1906a.C24847a.C248513.f58995a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.login.a.a$c r0 = com.facebook.login.p1906a.C24847a.EnumC24855c.DISPLAY_ALWAYS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.login.p1906a.C24847a.C248513.f58995a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.login.a.a$c r0 = com.facebook.login.p1906a.C24847a.EnumC24855c.NEVER_DISPLAY     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.p1906a.C24847a.C248513.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.facebook.login.a.a$b */
    public class View$OnClickListenerC24853b implements View.OnClickListener {
        static {
            Covode.recordClassIndex(29042);
        }

        /* renamed from: a */
        private LoginManager m47657a() {
            if (C24677a.m47209a(this)) {
                return null;
            }
            try {
                LoginManager a = LoginManager.m47593a();
                a.f58955b = C24847a.this.getDefaultAudience();
                a.f58954a = C24847a.this.getLoginBehavior();
                a.f58956c = C24847a.this.getAuthType();
                return a;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
                return null;
            }
        }

        protected View$OnClickListenerC24853b() {
        }

        public void onClick(View view) {
            int i;
            String string;
            if (!C24677a.m47209a(this)) {
                try {
                    C24847a aVar = C24847a.this;
                    if (!C24677a.m47209a(aVar)) {
                        try {
                            if (aVar.f57630b != null) {
                                aVar.f57630b.onClick(view);
                            }
                        } catch (Throwable th) {
                            C24677a.m47208a(th, aVar);
                        }
                    }
                    AccessToken accessToken = C24012b.m45437a().f56861b;
                    int i2 = 0;
                    if (AccessToken.m45056a()) {
                        Context context = C24847a.this.getContext();
                        if (!C24677a.m47209a(this)) {
                            try {
                                final LoginManager a = m47657a();
                                if (C24847a.this.f58978c) {
                                    String string2 = C24847a.this.getResources().getString(R.string.ahn);
                                    String string3 = C24847a.this.getResources().getString(R.string.ahj);
                                    Profile profile = C25031w.m47997a().f59375b;
                                    if (profile == null || profile.f56484f == null) {
                                        string = C24847a.this.getResources().getString(R.string.ahq);
                                    } else {
                                        string = C1764a.m5928a(C24847a.this.getResources().getString(R.string.ahp), new Object[]{profile.f56484f});
                                    }
                                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                                    builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() {
                                        /* class com.facebook.login.p1906a.C24847a.View$OnClickListenerC24853b.DialogInterface$OnClickListenerC248541 */

                                        static {
                                            Covode.recordClassIndex(29043);
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            a.mo40702b();
                                        }
                                    }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                                    builder.create().show();
                                } else {
                                    a.mo40702b();
                                }
                            } catch (Throwable th2) {
                                C24677a.m47208a(th2, this);
                            }
                        }
                    } else if (!C24677a.m47209a(this)) {
                        try {
                            LoginManager a2 = m47657a();
                            if (C24847a.this.getFragment() != null) {
                                Fragment fragment = C24847a.this.getFragment();
                                a2.mo40699a(new C24776s(fragment), C24847a.this.f58979d.f58997b);
                            } else if (C24847a.this.getNativeFragment() != null) {
                                android.app.Fragment nativeFragment = C24847a.this.getNativeFragment();
                                a2.mo40699a(new C24776s(nativeFragment), C24847a.this.f58979d.f58997b);
                            } else {
                                Activity activity = C24847a.this.getActivity();
                                a2.mo40700a(new LoginManager.C24840a(activity), a2.mo40697a(C24847a.this.f58979d.f58997b));
                            }
                        } catch (Throwable th3) {
                            C24677a.m47208a(th3, this);
                        }
                    }
                    C23998m mVar = new C23998m(C24847a.this.getContext());
                    Bundle bundle = new Bundle();
                    if (accessToken != null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    bundle.putInt("logging_in", i);
                    if (AccessToken.m45056a()) {
                        i2 = 1;
                    }
                    bundle.putInt("access_token_expired", i2);
                    mVar.mo39478d();
                } catch (Throwable th4) {
                    C24677a.m47208a(th4, this);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40719a() {
        if (!C24677a.m47209a(this)) {
            try {
                Resources resources = getResources();
                if (isInEditMode() || !AccessToken.m45056a()) {
                    String str = this.f58981g;
                    if (str != null) {
                        setText(str);
                        return;
                    }
                    String string = resources.getString(R.string.ahl);
                    int width = getWidth();
                    if (width != 0 && m47652c(string) > width) {
                        string = resources.getString(R.string.ahk);
                    }
                    setText(string);
                    return;
                }
                String str2 = this.f58982h;
                if (str2 == null) {
                    str2 = resources.getString(R.string.aho);
                }
                setText(str2);
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setLoginManager(LoginManager loginManager) {
        this.f58989o = loginManager;
    }

    /* access modifiers changed from: package-private */
    public void setProperties(C24852a aVar) {
        this.f58979d = aVar;
    }

    public void setToolTipDisplayTime(long j) {
        this.f58986l = j;
    }

    public void setToolTipMode(EnumC24855c cVar) {
        this.f58985k = cVar;
    }

    public void setToolTipStyle(C24856b.EnumC24861b bVar) {
        this.f58984j = bVar;
    }

    public void setAuthType(String str) {
        this.f58979d.f58999d = str;
    }

    public void setDefaultAudience(EnumC24862b bVar) {
        this.f58979d.f58996a = bVar;
    }

    public void setLoginBehavior(EnumC24864d dVar) {
        this.f58979d.f58998c = dVar;
    }

    public void setLoginText(String str) {
        this.f58981g = str;
        mo40719a();
    }

    public void setLogoutText(String str) {
        this.f58982h = str;
        mo40719a();
    }

    public void setPermissions(List<String> list) {
        this.f58979d.f58997b = list;
    }

    public void setPublishPermissions(List<String> list) {
        this.f58979d.f58997b = list;
    }

    public void setReadPermissions(List<String> list) {
        this.f58979d.f58997b = list;
    }

    public void setPermissions(String... strArr) {
        this.f58979d.f58997b = Arrays.asList(strArr);
    }

    public void setPublishPermissions(String... strArr) {
        this.f58979d.f58997b = Arrays.asList(strArr);
    }

    public void setReadPermissions(String... strArr) {
        this.f58979d.f58997b = Arrays.asList(strArr);
    }

    public C24847a(Context context) {
        super(context, "fb_login_button_create", "fb_login_button_did_tap");
    }

    /* renamed from: c */
    private int m47652c(String str) {
        if (C24677a.m47209a(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + mo40092a(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40720b(String str) {
        if (!C24677a.m47209a(this)) {
            try {
                C24856b bVar = new C24856b(str, this);
                this.f58987m = bVar;
                bVar.mo40756a(this.f58984j);
                this.f58987m.mo40755a(this.f58986l);
                this.f58987m.mo40754a();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    @Override // com.facebook.AbstractC24309g
    public void onDraw(Canvas canvas) {
        if (!C24677a.m47209a(this)) {
            try {
                super.onDraw(canvas);
                if (!this.f58983i && !isInEditMode()) {
                    this.f58983i = true;
                    if (!C24677a.m47209a(this)) {
                        try {
                            int i = C248513.f58995a[this.f58985k.ordinal()];
                            if (i == 1) {
                                final String a = C24693ad.m47233a(getContext());
                                C24872m.m47689c().execute(new Runnable() {
                                    /* class com.facebook.login.p1906a.C24847a.RunnableC248481 */

                                    static {
                                        Covode.recordClassIndex(29037);
                                    }

                                    public final void run() {
                                        if (!C24677a.m47209a(this)) {
                                            try {
                                                final C24768q a = C24770r.m47427a(a, false);
                                                C24847a.this.getActivity().runOnUiThread(new Runnable() {
                                                    /* class com.facebook.login.p1906a.C24847a.RunnableC248481.RunnableC248491 */

                                                    static {
                                                        Covode.recordClassIndex(29038);
                                                    }

                                                    public final void run() {
                                                        if (!C24677a.m47209a(this)) {
                                                            try {
                                                                C24847a aVar = C24847a.this;
                                                                C24768q qVar = a;
                                                                if (!C24677a.m47209a(aVar) && qVar != null) {
                                                                    try {
                                                                        if (qVar.f58755c && aVar.getVisibility() == 0) {
                                                                            aVar.mo40720b(qVar.f58754b);
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        C24677a.m47208a(th, aVar);
                                                                    }
                                                                }
                                                            } catch (Throwable th2) {
                                                                C24677a.m47208a(th2, this);
                                                            }
                                                        }
                                                    }
                                                });
                                            } catch (Throwable th) {
                                                C24677a.m47208a(th, this);
                                            }
                                        }
                                    }
                                });
                            } else if (i == 2) {
                                mo40720b(getResources().getString(R.string.ahy));
                            }
                        } catch (Throwable th) {
                            C24677a.m47208a(th, this);
                        }
                    }
                }
            } catch (Throwable th2) {
                C24677a.m47208a(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (!C24677a.m47209a(this)) {
            try {
                super.onVisibilityChanged(view, i);
                if (i != 0) {
                    m47651b();
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!C24677a.m47209a(this)) {
            try {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
                Resources resources = getResources();
                String str = this.f58981g;
                if (str == null) {
                    str = resources.getString(R.string.ahl);
                    int c = m47652c(str);
                    if (resolveSize(c, i) < c) {
                        str = resources.getString(R.string.ahk);
                    }
                }
                int c2 = m47652c(str);
                String str2 = this.f58982h;
                if (str2 == null) {
                    str2 = resources.getString(R.string.aho);
                }
                setMeasuredDimension(resolveSize(Math.max(c2, m47652c(str2)), i), compoundPaddingTop);
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    @Override // com.facebook.AbstractC24309g
    /* renamed from: a */
    public final void mo40093a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!C24677a.m47209a(this)) {
            try {
                super.mo40093a(context, attributeSet, i, i2);
                setInternalOnClickListener(getNewLoginClickListener());
                if (!C24677a.m47209a(this)) {
                    try {
                        this.f58985k = EnumC24855c.DEFAULT;
                        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.os, R.attr.ow, R.attr.ox, R.attr.p2}, i, i2);
                        try {
                            this.f58978c = obtainStyledAttributes.getBoolean(0, true);
                            this.f58981g = obtainStyledAttributes.getString(1);
                            this.f58982h = obtainStyledAttributes.getString(2);
                            this.f58985k = EnumC24855c.fromInt(obtainStyledAttributes.getInt(3, EnumC24855c.DEFAULT.getValue()));
                        } finally {
                            obtainStyledAttributes.recycle();
                        }
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
                if (isInEditMode()) {
                    setBackgroundColor(getResources().getColor(R.color.fk));
                    this.f58981g = "Continue with Facebook";
                } else {
                    this.f58988n = new AbstractC24150d() {
                        /* class com.facebook.login.p1906a.C24847a.C248502 */

                        static {
                            Covode.recordClassIndex(29039);
                        }

                        @Override // com.facebook.AbstractC24150d
                        /* renamed from: a */
                        public final void mo39735a() {
                            C24847a.this.mo40719a();
                        }
                    };
                }
                mo40719a();
                setCompoundDrawablesWithIntrinsicBounds(C0196a.m619b(getContext(), R.drawable.ws), (Drawable) null, (Drawable) null, (Drawable) null);
            } catch (Throwable th2) {
                C24677a.m47208a(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!C24677a.m47209a(this)) {
            try {
                super.onLayout(z, i, i2, i3, i4);
                mo40719a();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }
}
