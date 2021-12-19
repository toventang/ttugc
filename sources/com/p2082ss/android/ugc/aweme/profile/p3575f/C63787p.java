package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.app.C0569a;
import androidx.core.content.C0645c;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.dialog.C23048e;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80310cp;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.C87936a;
import com.zhihu.matisse.EnumC87938b;
import com.zhihu.matisse.internal.entity.C87955b;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p4511a.AbstractC87937a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p078c.p080b.C1757e;
import p078c.p083d.C1762a;

/* renamed from: com.ss.android.ugc.aweme.profile.f.p */
public class C63787p {

    /* renamed from: a */
    private int f144589a = 250;

    /* renamed from: b */
    protected final Activity f144590b;

    /* renamed from: c */
    protected final Resources f144591c;

    /* renamed from: d */
    protected final Fragment f144592d;

    /* renamed from: e */
    public final String f144593e;

    /* renamed from: f */
    protected final String f144594f;

    /* renamed from: g */
    protected final WeakHandler f144595g;

    /* renamed from: h */
    protected final AbstractC63792a f144596h;

    /* renamed from: i */
    public int f144597i = 1;

    /* renamed from: j */
    private int f144598j = 250;

    /* renamed from: k */
    private DialogC17223o f144599k;

    /* renamed from: com.ss.android.ugc.aweme.profile.f.p$a */
    public interface AbstractC63792a {
        static {
            Covode.recordClassIndex(75120);
        }

        /* renamed from: b */
        void mo102364b(String str);

        /* renamed from: c */
        void mo102365c();
    }

    static {
        Covode.recordClassIndex(75115);
    }

    /* renamed from: b */
    public static int m115363b(int i) {
        if (i == 0) {
            return 10003;
        }
        if (i == 1) {
            return 10006;
        }
        if (i == 2) {
            return 10007;
        }
        if (i == 3) {
            return 10008;
        }
        if (i == 5) {
            return 10010;
        }
        if (i != 6) {
            return i != 7 ? 10003 : 10014;
        }
        return 10013;
    }

    /* renamed from: c */
    public static int m115366c(int i) {
        if (i == 0) {
            return 10004;
        }
        if (i != 3) {
            return i != 5 ? 10004 : 10011;
        }
        return 10009;
    }

    /* renamed from: a */
    public final void mo102350a(Activity activity, View view, User user, String str) {
        String[] a = m115362a(this.f144591c, 0, 1, 3, 4);
        C23208a.C23211b a2 = new C23208a.C23211b().mo37793a(new DialogInterface$OnCancelListenerC63794q(this));
        C23208a.C23214e[] eVarArr = new C23208a.C23214e[3];
        String str2 = "";
        eVarArr[0] = new C23208a.C23214e().mo37788a(a.length > 0 ? a[0] : str2).mo37786a(new View$OnClickListenerC63795r(this, activity, 0));
        eVarArr[1] = new C23208a.C23214e().mo37788a(a.length >= 2 ? a[1] : str2).mo37786a(new View$OnClickListenerC63796s(this, 0));
        C23208a.C23214e eVar = new C23208a.C23214e();
        if (a.length >= 3) {
            str2 = a[2];
        }
        eVarArr[2] = eVar.mo37788a(str2).mo37786a(new View$OnClickListenerC63797t(this, activity, view, str, user));
        a2.mo37797a(eVarArr).mo37800b().show(this.f144592d.getFragmentManager(), "Click Avatar Image");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo102351a(Activity activity, View view, String str, User user) {
        if (!mo102357f()) {
            C63873h.f144797a.startHeaderDetailActivity(activity, view, str, user);
        }
    }

    /* renamed from: a */
    public boolean mo102317a(int i, int i2, Intent intent) {
        Uri uri;
        Uri uri2;
        Uri data;
        String a;
        if (i == 10004 || i == 10009 || i == 10011) {
            C63873h.f144797a.getNotificationManagerHandleSystemCamera().invoke(false);
        }
        if (i2 != -1) {
            return false;
        }
        if (i != 10003 && i != 10008 && i != 10006 && i != 10010) {
            if (i == 10007 || i == 10014) {
                if (intent == null) {
                    return false;
                }
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
                if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                    uri2 = intent.getData();
                } else {
                    uri2 = (Uri) parcelableArrayListExtra.get(0);
                }
                String a2 = C1762a.m5918a(this.f144590b, uri2);
                if (C13627m.m24498a(a2)) {
                    new C23144b(this.f144590b).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
                    return false;
                } else if (!new File(a2).exists()) {
                    new C23144b(this.f144590b).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
                    return false;
                } else {
                    AbstractC63792a aVar = this.f144596h;
                    if (aVar != null) {
                        aVar.mo102364b(a2);
                    }
                }
            } else if (i == 10004 || i == 10009 || i == 10011) {
                try {
                    m115361a(m115364b(mo102318b()), true, i);
                    return true;
                } catch (Exception unused) {
                }
            } else if (i != 10002 || intent == null || (data = intent.getData()) == null || (a = C1762a.m5918a(this.f144590b, data)) == null) {
                return false;
            } else {
                File file = new File(a);
                if (!file.exists()) {
                    return false;
                }
                if (C63799v.m115392a(file.getAbsolutePath(), this.f144589a, this.f144598j)) {
                    new C79459a(this.f144590b).mo123050a(R.string.dp6).mo123053a();
                    return true;
                }
                AbstractC63792a aVar2 = this.f144596h;
                if (aVar2 != null) {
                    aVar2.mo102364b(file.getAbsolutePath());
                }
                return true;
            }
            return false;
        } else if (intent == null) {
            return false;
        } else {
            ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("extra_result_selection");
            if (parcelableArrayListExtra2 == null || parcelableArrayListExtra2.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) parcelableArrayListExtra2.get(0);
            }
            if (!C1757e.m5913c(this.f144590b, uri)) {
                new C23144b(this.f144590b).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
                return false;
            }
            m115361a(uri, false, i);
            return true;
        }
    }

    /* renamed from: h */
    public final String mo102359h() {
        return mo102318b();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.f.p$b */
    public static class C63793b extends AbstractC87937a {

        /* renamed from: a */
        private int f144609a = 250;

        /* renamed from: b */
        private int f144610b = 250;

        static {
            Covode.recordClassIndex(75121);
        }

        public C63793b() {
        }

        public C63793b(int i, int i2) {
            this.f144609a = i;
            this.f144610b = i2;
        }

        @Override // com.zhihu.matisse.p4511a.AbstractC87937a
        /* renamed from: a */
        public final C87955b mo61898a(Context context, Item item) {
            Uri uri = item.f199738c;
            if (SettingsManager.m29616a().mo25400a("head_upload_filter_settings", false) && !C1757e.m5913c(context, uri)) {
                return new C87955b(context.getString(R.string.doo), (byte) 0);
            }
            if (C63799v.m115391a(context, uri, this.f144609a, this.f144610b)) {
                return new C87955b(context.getString(R.string.dp6), (byte) 0);
            }
            return null;
        }
    }

    /* renamed from: g */
    public final void mo102358g() {
        DialogC17223o oVar = this.f144599k;
        if (oVar != null && oVar.isShowing()) {
            this.f144599k.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo102361j() {
        C29823c.m60080a(this.f144590b, "live_image_popup", "cancel");
    }

    /* renamed from: e */
    public final void mo102354e() {
        new DialogC18267b.C18268a(this.f144590b).mo29155a(m115362a(this.f144591c, 0, 1, 4), new DialogInterface.OnClickListener(0) {
            /* class com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p.DialogInterface$OnClickListenerC637881 */

            /* renamed from: a */
            final /* synthetic */ int f144600a = 0;

            static {
                Covode.recordClassIndex(75116);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(C63787p.this.f144593e)) {
                    new C79459a(C63787p.this.f144590b).mo123050a(R.string.feu).mo123053a();
                    C51423a.m95790a((Throwable) new Exception("SD card is not available"));
                } else if (i == 0) {
                    C63787p.this.mo102355e(this.f144600a);
                } else if (i != 1) {
                    C29823c.m60080a(C63787p.this.f144590b, "live_image_popup", "cancel");
                } else {
                    C63787p.this.mo102346a(this.f144600a);
                }
            }
        }).mo29157b().show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo102357f() {
        if (!TextUtils.isEmpty(this.f144593e)) {
            return false;
        }
        new C23144b(this.f144590b).mo37640e(R.string.feu).mo37637b();
        C51423a.m95790a((Throwable) new Exception("SD card is not available"));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo102360i() {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + this.f144590b.getPackageName()));
            intent.addFlags(268435456);
            Activity activity = this.f144590b;
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        } catch (Exception unused) {
            C80310cp.m139213a(this.f144590b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo102318b() {
        return this.f144593e + "/" + this.f144594f;
    }

    /* renamed from: a */
    private static File m115360a(Context context) {
        File b = m115365b(context);
        if (b != null) {
            return b;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        C22708a.m42800a("HeadUploadHelper: cache dir == null");
        return externalStorageDirectory;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo102356f(int i) {
        if (!mo102357f()) {
            mo102346a(i);
        }
    }

    /* renamed from: b */
    private static File m115365b(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: a */
    public final File mo102345a(String str) {
        if (!C80720e.m139935d() || !C80720e.m139939e() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(m115360a(this.f144590b), str);
        C80720e.m139920a(file);
        return file;
    }

    /* renamed from: b */
    private Uri m115364b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f144593e);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    /* renamed from: a */
    public final void mo102346a(final int i) {
        if (C0645c.m2379a(this.f144590b, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            try {
                C35444b.m72473a(this.f144590b, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C35444b.AbstractC35447b() {
                    /* class com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p.C637892 */

                    static {
                        Covode.recordClassIndex(75117);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
                    /* renamed from: a */
                    public final void mo53515a(String[] strArr, int[] iArr) {
                        if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                            C29823c.m60080a(C63787p.this.f144590b, "live_image_popup", "album");
                            C63787p.this.mo102353d(C63787p.m115363b(i));
                        } else if (!C0569a.m2183a(C63787p.this.f144590b, "android.permission.READ_EXTERNAL_STORAGE")) {
                            C63787p.this.mo102347a(R.string.ax1, R.string.ail);
                        } else {
                            new C79459a(C63787p.this.f144590b).mo123052a(C63787p.this.f144590b.getString(R.string.dng)).mo123053a();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        } else {
            C29823c.m60080a(this.f144590b, "live_image_popup", "album");
            mo102353d(m115363b(i));
        }
    }

    /* renamed from: e */
    public final void mo102355e(final int i) {
        if (C80620e.m139779a()) {
            C35444b.m72473a(this.f144590b, new String[]{"android.permission.CAMERA"}, new C35444b.AbstractC35447b() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p.C637903 */

                static {
                    Covode.recordClassIndex(75118);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
                /* renamed from: a */
                public final void mo53515a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        C29823c.m60080a(C63787p.this.f144590b, "live_image_popup", "take_photo");
                        C63873h.f144797a.getStartCameraActivity().invoke(C63787p.this.f144590b, C63787p.this.f144592d, Integer.valueOf(C63787p.m115366c(i)), C63787p.this.f144593e, C63787p.this.f144594f);
                    } else if (!C0569a.m2183a(C63787p.this.f144590b, "android.permission.CAMERA")) {
                        C63787p.this.mo102347a(R.string.gem, R.string.a99);
                    } else {
                        new C79459a(C63787p.this.f144590b).mo123052a(C63787p.this.f144590b.getString(R.string.dne)).mo123053a();
                    }
                }
            });
        } else if (C80620e.m139778a(this.f144590b) != -1) {
            C29823c.m60080a(this.f144590b, "live_image_popup", "take_photo");
            C63873h.f144797a.getStartCameraActivity().invoke(this.f144590b, this.f144592d, Integer.valueOf(m115366c(i)), this.f144593e, this.f144594f);
        } else if (!C0569a.m2183a(this.f144590b, "android.permission.CAMERA")) {
            mo102347a(R.string.gem, R.string.a99);
        } else {
            new C79459a(this.f144590b).mo123052a(this.f144590b.getString(R.string.dne)).mo123053a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo102353d(int i) {
        C29823c.m60080a(this.f144590b, "live_image_popup", "album");
        try {
            Fragment fragment = this.f144592d;
            if (fragment != null) {
                C87936a.m152943a(fragment).mo142434a(EnumC87938b.ofImage()).mo142439a().mo142444c().mo142440a(this.f144597i).mo142445d().mo142442b().mo142446e().mo142441a(new C63793b(this.f144589a, this.f144598j)).mo142443b(i);
            } else {
                C87936a.m152942a(this.f144590b).mo142434a(EnumC87938b.ofImage()).mo142439a().mo142444c().mo142440a(this.f144597i).mo142445d().mo142442b().mo142446e().mo142441a(new C63793b(this.f144589a, this.f144598j)).mo142443b(i);
            }
        } catch (Exception e) {
            C51423a.m95788a("", e);
            C30128d.m60945a(this.f144590b, this.f144592d, i);
        }
    }

    /* renamed from: b */
    public final void mo102352b(String str, List<C29934d> list) {
        AbstractC63792a aVar = this.f144596h;
        if (aVar != null) {
            aVar.mo102365c();
        }
        mo102348a(0, str, list);
    }

    /* renamed from: a */
    private static String[] m115362a(Resources resources, short... sArr) {
        String[] stringArray = resources.getStringArray(R.array.ad);
        String[] strArr = new String[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            strArr[i] = stringArray[sArr[i]];
        }
        return strArr;
    }

    /* renamed from: a */
    public final void mo102347a(int i, int i2) {
        ((C23048e) new C23048e(this.f144590b).mo37479a(i).mo37483b(i2)).mo37444a((DialogInterface.OnClickListener) null).mo37443a(R.string.c4j, new DialogInterface$OnClickListenerC63798u(this)).mo37442a().mo37396b().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo102349a(Activity activity, int i) {
        if (!mo102357f()) {
            if (activity == null || !MSAdaptionService.m97895c().mo89375b(activity)) {
                mo102355e(i);
                return;
            }
            Toast makeText = Toast.makeText(activity, activity.getString(R.string.bed), 0);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
        }
    }

    /* renamed from: a */
    private void m115361a(Uri uri, boolean z, int i) {
        Context context;
        int i2;
        boolean z2;
        float f;
        if (uri != null) {
            if (!z) {
                String lastPathSegment = uri.getLastPathSegment();
                int i3 = Build.VERSION.SDK_INT;
                if (!C13627m.m24498a(lastPathSegment) && lastPathSegment.contains(":")) {
                    lastPathSegment = lastPathSegment.split(":")[1];
                }
                try {
                    ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(lastPathSegment));
                } catch (NumberFormatException unused) {
                }
            }
            Fragment fragment = this.f144592d;
            if (fragment != null) {
                context = fragment.getContext();
            } else {
                context = this.f144590b;
            }
            if (context != null) {
                if (i == 10003 || i == 10004) {
                    z2 = true;
                    i2 = 0;
                } else {
                    z2 = false;
                    i2 = -1;
                }
                if (z2 || i == 10009 || i == 10008 || i == 10010 || i == 10011) {
                    f = 1.0f;
                } else {
                    f = 0.5625f;
                }
                if (Math.abs(f - 1.0f) < Float.MIN_NORMAL) {
                    C13628n.m24520b(context, 30.0f);
                } else {
                    C13628n.m24520b(context, 16.0f);
                }
                int b = (int) C13628n.m24520b(context, 16.0f);
                if (this.f144592d == null) {
                    C63873h.f144797a.gotoCropActivity(this.f144590b, uri.toString(), z2, f, b, 10002, this.f144589a, this.f144598j, i2);
                } else {
                    C63873h.f144797a.gotoCropActivity(this.f144592d, uri.toString(), z2, f, b, 10002, this.f144589a, this.f144598j, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo102348a(int i, final String str, final List<C29934d> list) {
        C29339a.m58753a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p.RunnableC637914 */

            static {
                Covode.recordClassIndex(75119);
            }

            public final void run() {
                int i;
                try {
                    File file = new File(str);
                    if (file.exists() && file.length() > 4194304) {
                        C51423a.m95787a("upload file size: " + file.length());
                        i = (((int) (file.length() / 1024)) + 1) * 1024;
                        C31575b.m65865g().uploadAvatar(C63787p.this.f144595g, Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId(), i, str, list);
                    }
                } catch (Exception e) {
                    C51423a.m95790a((Throwable) e);
                }
                i = 4194304;
                C31575b.m65865g().uploadAvatar(C63787p.this.f144595g, Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId(), i, str, list);
            }
        }, i);
    }

    public C63787p(Activity activity, Fragment fragment, WeakHandler weakHandler, AbstractC63792a aVar) {
        this.f144590b = activity;
        this.f144592d = fragment;
        this.f144595g = weakHandler;
        this.f144596h = aVar;
        File a = mo102345a("head");
        if (a != null) {
            this.f144593e = a.getPath();
        } else {
            this.f144593e = "";
        }
        this.f144594f = "head.data";
        this.f144591c = activity.getResources();
    }
}
