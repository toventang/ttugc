package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Environment;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.NotificationManagerServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80224ar;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$startCameraActivity$1 */
final /* synthetic */ class ProfileDependentComponentImpl$startCameraActivity$1 extends C89217j implements AbstractC89189s<Activity, Fragment, Integer, String, String, C89391z> {
    public static final ProfileDependentComponentImpl$startCameraActivity$1 INSTANCE = new ProfileDependentComponentImpl$startCameraActivity$1();

    static {
        Covode.recordClassIndex(79720);
    }

    ProfileDependentComponentImpl$startCameraActivity$1() {
        super(5, C80224ar.class, "startCameraActivity", "startCameraActivity(Landroid/app/Activity;Landroidx/fragment/app/Fragment;ILjava/lang/String;Ljava/lang/String;)V", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89189s
    public final /* synthetic */ C89391z invoke(Activity activity, Fragment fragment, Integer num, String str, String str2) {
        invoke(activity, fragment, num.intValue(), str, str2);
        return C89391z.f203057a;
    }

    public final void invoke(Activity activity, Fragment fragment, int i, String str, String str2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!C89219l.m154714a((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            new C23144b(activity).mo37636b(2131231583).mo37640e(R.string.dol).mo37637b();
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str2);
        intent.addFlags(1);
        intent.putExtra("output", C30128d.m60943a(activity, file2));
        if (fragment != null) {
            try {
                fragment.startActivityForResult(intent, i);
            } catch (Exception unused) {
                new C23144b(activity).mo37636b(2131231583).mo37640e(R.string.doi).mo37637b();
                return;
            }
        } else {
            activity.startActivityForResult(intent, i);
        }
        INotificationManagerService d = NotificationManagerServiceImpl.m101386d();
        if (d != null) {
            d.mo90135a(true);
        }
    }
}
