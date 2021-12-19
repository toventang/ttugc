package com.facebook.share.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.c */
public final class C24941c {
    static {
        Covode.recordClassIndex(30245);
    }

    /* renamed from: a */
    private static Bundle m47796a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C24693ad.m47248a(bundle, "com.facebook.platform.extra.LINK", shareContent.f59237h);
        C24693ad.m47249a(bundle, "com.facebook.platform.extra.PLACE", shareContent.f59239j);
        C24693ad.m47249a(bundle, "com.facebook.platform.extra.REF", shareContent.f59241l);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f59238i;
        if (!C24693ad.m47262a(list)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(list));
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m47797a(UUID uuid, ShareContent shareContent, boolean z) {
        C24699ae.m47301a(shareContent, "shareContent");
        C24699ae.m47301a(uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle a = m47796a(shareLinkContent, z);
            C24693ad.m47249a(a, "com.facebook.platform.extra.TITLE", shareLinkContent.f59252b);
            C24693ad.m47249a(a, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.f59251a);
            C24693ad.m47248a(a, "com.facebook.platform.extra.IMAGE", shareLinkContent.f59253c);
            return a;
        } else if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List<String> a2 = C24954k.m47868a(sharePhotoContent, uuid);
            Bundle a3 = m47796a(sharePhotoContent, z);
            a3.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(a2));
            return a3;
        } else if ((shareContent instanceof ShareVideoContent) || !(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        } else {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                JSONObject a4 = C24954k.m47871a(uuid, shareOpenGraphContent);
                Bundle a5 = m47796a(shareOpenGraphContent, z);
                C24693ad.m47249a(a5, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.f59288b);
                C24693ad.m47249a(a5, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.f59287a.mo40871b("og:type"));
                C24693ad.m47249a(a5, "com.facebook.platform.extra.ACTION", a4.toString());
                return a5;
            } catch (JSONException e) {
                throw new C24798j("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
            }
        }
    }
}
