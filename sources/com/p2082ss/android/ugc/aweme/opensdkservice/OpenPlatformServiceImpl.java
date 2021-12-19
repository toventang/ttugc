package com.p2082ss.android.ugc.aweme.opensdkservice;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.metrics.C59214ai;
import com.p2082ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;
import com.p2082ss.android.ugc.aweme.p4071t.C77717b;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67189c;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.EditConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl */
public final class OpenPlatformServiceImpl implements IOpenPlatformService {
    static {
        Covode.recordClassIndex(73533);
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl$a */
    public static final class C62722a implements C77717b.AbstractC77720a {

        /* renamed from: a */
        final /* synthetic */ HandleMediaListener f142182a;

        static {
            Covode.recordClassIndex(73534);
        }

        @Override // com.p2082ss.android.ugc.aweme.p4071t.C77717b.AbstractC77720a
        /* renamed from: a */
        public final void mo100642a() {
            HandleMediaListener handleMediaListener = this.f142182a;
            if (handleMediaListener != null) {
                handleMediaListener.onArgsError();
            }
        }

        C62722a(HandleMediaListener handleMediaListener) {
            this.f142182a = handleMediaListener;
        }

        @Override // com.p2082ss.android.ugc.aweme.p4071t.C77717b.AbstractC77720a
        /* renamed from: a */
        public final void mo100643a(ArrayList<String> arrayList) {
            C89219l.m154721d(arrayList, "");
            HandleMediaListener handleMediaListener = this.f142182a;
            if (handleMediaListener != null) {
                handleMediaListener.onGetVideoPath(arrayList);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p4071t.C77717b.AbstractC77720a
        /* renamed from: b */
        public final void mo100644b(ArrayList<String> arrayList) {
            C89219l.m154721d(arrayList, "");
            HandleMediaListener handleMediaListener = this.f142182a;
            if (handleMediaListener != null) {
                handleMediaListener.onGetImagePath(arrayList);
            }
        }
    }

    /* renamed from: b */
    public static IOpenPlatformService m113101b() {
        Object a = C81908b.m141854a(IOpenPlatformService.class, false);
        if (a != null) {
            return (IOpenPlatformService) a;
        }
        return new OpenPlatformServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    /* renamed from: a */
    public final void mo100636a() {
        new C58221f.C58223b().mo95701b((AbstractC58259r) new C67189c()).mo95706a();
    }

    @Override // com.p2082ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    /* renamed from: a */
    public final boolean mo100641a(Intent intent) {
        C89219l.m154721d(intent, "");
        if (!TextUtils.isEmpty(C77717b.m135746a(intent, "_aweme_open_sdk_params_client_key"))) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    /* renamed from: a */
    public final void mo100637a(Intent intent, HandleMediaListener handleMediaListener) {
        C89219l.m154721d(intent, "");
        C62722a aVar = new C62722a(handleMediaListener);
        Bundle a = C77717b.m135745a(intent);
        if (a != null) {
            ArrayList<String> stringArrayList = a.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
            ArrayList<String> stringArrayList2 = a.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
            if (!C13603b.m24435a((Collection) stringArrayList)) {
                aVar.mo100644b(stringArrayList);
            } else if (!C13603b.m24435a((Collection) stringArrayList2)) {
                aVar.mo100643a(stringArrayList2);
            } else {
                aVar.mo100642a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    /* renamed from: a */
    public final void mo100638a(Fragment fragment, ArrayList<String> arrayList) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(arrayList, "");
        if (fragment != null && fragment.getContext() != null) {
            Intent intent = new Intent(fragment.getContext(), AwemeAuthorizeLoginActivity.class);
            intent.putStringArrayListExtra("authorize_hide_platforms", arrayList);
            fragment.startActivityForResult(intent, 2001);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    /* renamed from: a */
    public final void mo100639a(EditConfig.Builder builder, String str) {
        C89219l.m154721d(builder, "");
        C89219l.m154721d(str, "");
        AVChallenge aVChallenge = new AVChallenge();
        ArrayList arrayList = new ArrayList();
        aVChallenge.challengeName = str;
        arrayList.add(aVChallenge);
        builder.challenges(arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    /* renamed from: a */
    public final void mo100640a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C59214ai aiVar = new C59214ai();
        aiVar.f134857a = str;
        aiVar.f134859c = str2;
        aiVar.f134861e = 1;
        aiVar.f134862p = str3;
        aiVar.f134860d = str4;
        aiVar.mo96792f();
    }
}
