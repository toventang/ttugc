package com.facebook.share.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.internal.C24693ad;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.m */
public final class C24966m {
    static {
        Covode.recordClassIndex(30270);
    }

    /* renamed from: a */
    private static Bundle m47892a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.f59242m;
        if (shareHashtag != null) {
            C24693ad.m47249a(bundle, "hashtag", shareHashtag.f59249a);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m47893a(ShareLinkContent shareLinkContent) {
        Bundle a = m47892a((ShareContent) shareLinkContent);
        C24693ad.m47248a(a, "href", shareLinkContent.f59237h);
        C24693ad.m47249a(a, "quote", shareLinkContent.f59254d);
        return a;
    }

    /* renamed from: a */
    public static Bundle m47894a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = m47892a((ShareContent) shareOpenGraphContent);
        C24693ad.m47249a(a, "action_type", shareOpenGraphContent.f59287a.mo40871b("og:type"));
        try {
            JSONObject a2 = C24954k.m47872a(C24954k.m47870a(shareOpenGraphContent), false);
            if (a2 != null) {
                C24693ad.m47249a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new C24798j("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    /* renamed from: a */
    public static Bundle m47895a(SharePhotoContent sharePhotoContent) {
        Bundle a = m47892a((ShareContent) sharePhotoContent);
        String[] strArr = new String[sharePhotoContent.f59299a.size()];
        C24693ad.m47242a((List) sharePhotoContent.f59299a, (C24693ad.AbstractC24697b) new C24693ad.AbstractC24697b<SharePhoto, String>() {
            /* class com.facebook.share.internal.C24966m.C249671 */

            static {
                Covode.recordClassIndex(30271);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.internal.C24693ad.AbstractC24697b
            /* renamed from: a */
            public final /* synthetic */ String mo40516a(SharePhoto sharePhoto) {
                return sharePhoto.f59292c.toString();
            }
        }).toArray(strArr);
        a.putStringArray("media", strArr);
        return a;
    }
}
