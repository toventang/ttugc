package com.facebook.share.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.share.internal.C24936b;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.e */
public final class C24944e {
    static {
        Covode.recordClassIndex(30248);
    }

    /* renamed from: a */
    public static Bundle m47818a(UUID uuid, ShareContent shareContent, boolean z) {
        C24699ae.m47301a(shareContent, "shareContent");
        C24699ae.m47301a(uuid, "callId");
        List list = null;
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle a = m47814a(shareLinkContent, z);
            C24693ad.m47249a(a, "TITLE", shareLinkContent.f59252b);
            C24693ad.m47249a(a, "DESCRIPTION", shareLinkContent.f59251a);
            C24693ad.m47248a(a, "IMAGE", shareLinkContent.f59253c);
            C24693ad.m47249a(a, "QUOTE", shareLinkContent.f59254d);
            C24693ad.m47248a(a, "MESSENGER_LINK", shareLinkContent.f59237h);
            C24693ad.m47248a(a, "TARGET_DISPLAY", shareLinkContent.f59237h);
            return a;
        } else if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List<String> a2 = C24954k.m47868a(sharePhotoContent, uuid);
            Bundle a3 = m47814a(sharePhotoContent, z);
            a3.putStringArrayList("PHOTOS", new ArrayList<>(a2));
            return a3;
        } else if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            String a4 = C24954k.m47866a(shareVideoContent, uuid);
            Bundle a5 = m47814a(shareVideoContent, z);
            C24693ad.m47249a(a5, "TITLE", shareVideoContent.f59308b);
            C24693ad.m47249a(a5, "DESCRIPTION", shareVideoContent.f59307a);
            C24693ad.m47249a(a5, "VIDEO", a4);
            return a5;
        } else if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                JSONObject a6 = C24954k.m47872a(C24954k.m47871a(uuid, shareOpenGraphContent), false);
                Bundle a7 = m47814a(shareOpenGraphContent, z);
                C24693ad.m47249a(a7, "PREVIEW_PROPERTY_NAME", (String) C24954k.m47857a(shareOpenGraphContent.f59288b).second);
                C24693ad.m47249a(a7, "ACTION_TYPE", shareOpenGraphContent.f59287a.mo40871b("og:type"));
                C24693ad.m47249a(a7, "ACTION", a6.toString());
                return a7;
            } catch (JSONException e) {
                throw new C24798j("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
            }
        } else if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            List<Bundle> a8 = C24954k.m47867a(shareMediaContent, uuid);
            Bundle a9 = m47814a(shareMediaContent, z);
            a9.putParcelableArrayList("MEDIA", new ArrayList<>(a8));
            return a9;
        } else if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return m47813a(shareCameraEffectContent, C24954k.m47855a(shareCameraEffectContent, uuid), z);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            return m47815a((ShareMessengerGenericTemplateContent) shareContent, z);
        } else {
            if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
                return m47817a((ShareMessengerOpenGraphMusicTemplateContent) shareContent, z);
            }
            if (shareContent instanceof ShareMessengerMediaTemplateContent) {
                return m47816a((ShareMessengerMediaTemplateContent) shareContent, z);
            }
            if (!(shareContent instanceof ShareStoryContent)) {
                return null;
            }
            ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
            Bundle b = C24954k.m47877b(shareStoryContent, uuid);
            Bundle a10 = C24954k.m47856a(shareStoryContent, uuid);
            Bundle a11 = m47814a(shareStoryContent, z);
            if (b != null) {
                a11.putParcelable("bg_asset", b);
            }
            if (a10 != null) {
                a11.putParcelable("interactive_asset_uri", a10);
            }
            if (shareStoryContent.f59303c != null) {
                list = Collections.unmodifiableList(shareStoryContent.f59303c);
            }
            if (!C24693ad.m47262a(list)) {
                a11.putStringArrayList("top_background_color_list", new ArrayList<>(list));
            }
            C24693ad.m47249a(a11, "content_url", shareStoryContent.f59304d);
            return a11;
        }
    }

    /* renamed from: a */
    private static Bundle m47814a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C24693ad.m47248a(bundle, "LINK", shareContent.f59237h);
        C24693ad.m47249a(bundle, "PLACE", shareContent.f59239j);
        C24693ad.m47249a(bundle, "PAGE", shareContent.f59240k);
        C24693ad.m47249a(bundle, "REF", shareContent.f59241l);
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f59238i;
        if (!C24693ad.m47262a(list)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(list));
        }
        ShareHashtag shareHashtag = shareContent.f59242m;
        if (shareHashtag != null) {
            C24693ad.m47249a(bundle, "HASHTAG", shareHashtag.f59249a);
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m47815a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent, boolean z) {
        Bundle a = m47814a((ShareContent) shareMessengerGenericTemplateContent, z);
        try {
            if (!C24677a.m47209a(C24942d.class)) {
                try {
                    ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement = shareMessengerGenericTemplateContent.f59267c;
                    if (!C24677a.m47209a(C24942d.class)) {
                        try {
                            if (shareMessengerGenericTemplateElement.f59273e != null) {
                                C24942d.m47810a(a, shareMessengerGenericTemplateElement.f59273e, false);
                            } else if (shareMessengerGenericTemplateElement.f59272d != null) {
                                C24942d.m47810a(a, shareMessengerGenericTemplateElement.f59272d, true);
                            }
                            C24693ad.m47248a(a, "IMAGE", shareMessengerGenericTemplateElement.f59271c);
                            C24693ad.m47249a(a, "PREVIEW_TYPE", "DEFAULT");
                            C24693ad.m47249a(a, "TITLE", shareMessengerGenericTemplateElement.f59269a);
                            C24693ad.m47249a(a, "SUBTITLE", shareMessengerGenericTemplateElement.f59270b);
                        } catch (Throwable th) {
                            C24677a.m47208a(th, C24942d.class);
                        }
                    }
                    C24693ad.m47259a(a, "MESSENGER_PLATFORM_CONTENT", C24942d.m47805a(shareMessengerGenericTemplateContent));
                } catch (Throwable th2) {
                    C24677a.m47208a(th2, C24942d.class);
                }
            }
            return a;
        } catch (JSONException e) {
            throw new C24798j("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: " + e.getMessage());
        }
    }

    /* renamed from: a */
    private static Bundle m47816a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent, boolean z) {
        Bundle a = m47814a((ShareContent) shareMessengerMediaTemplateContent, z);
        try {
            if (!C24677a.m47209a(C24942d.class)) {
                try {
                    if (!C24677a.m47209a(C24942d.class)) {
                        try {
                            C24942d.m47810a(a, shareMessengerMediaTemplateContent.f59277d, false);
                            C24693ad.m47249a(a, "PREVIEW_TYPE", "DEFAULT");
                            C24693ad.m47249a(a, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.f59275b);
                            if (shareMessengerMediaTemplateContent.f59276c != null) {
                                C24693ad.m47248a(a, C24942d.m47798a(shareMessengerMediaTemplateContent.f59276c), shareMessengerMediaTemplateContent.f59276c);
                            }
                            C24693ad.m47249a(a, StringSet.type, C24942d.m47800a(shareMessengerMediaTemplateContent.f59274a));
                        } catch (Throwable th) {
                            C24677a.m47208a(th, C24942d.class);
                        }
                    }
                    C24693ad.m47259a(a, "MESSENGER_PLATFORM_CONTENT", C24942d.m47807a(shareMessengerMediaTemplateContent));
                } catch (Throwable th2) {
                    C24677a.m47208a(th2, C24942d.class);
                }
            }
            return a;
        } catch (JSONException e) {
            throw new C24798j("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: " + e.getMessage());
        }
    }

    /* renamed from: a */
    private static Bundle m47817a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent, boolean z) {
        Bundle a = m47814a((ShareContent) shareMessengerOpenGraphMusicTemplateContent, z);
        try {
            if (!C24677a.m47209a(C24942d.class)) {
                try {
                    if (!C24677a.m47209a(C24942d.class)) {
                        try {
                            C24942d.m47810a(a, shareMessengerOpenGraphMusicTemplateContent.f59280b, false);
                            C24693ad.m47249a(a, "PREVIEW_TYPE", "OPEN_GRAPH");
                            C24693ad.m47248a(a, "OPEN_GRAPH_URL", shareMessengerOpenGraphMusicTemplateContent.f59279a);
                        } catch (Throwable th) {
                            C24677a.m47208a(th, C24942d.class);
                        }
                    }
                    C24693ad.m47259a(a, "MESSENGER_PLATFORM_CONTENT", C24942d.m47808a(shareMessengerOpenGraphMusicTemplateContent));
                } catch (Throwable th2) {
                    C24677a.m47208a(th2, C24942d.class);
                }
            }
            return a;
        } catch (JSONException e) {
            throw new C24798j("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: " + e.getMessage());
        }
    }

    /* renamed from: a */
    private static Bundle m47813a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z) {
        JSONObject jSONObject;
        Bundle a = m47814a(shareCameraEffectContent, z);
        C24693ad.m47249a(a, "effect_id", shareCameraEffectContent.f59234a);
        if (bundle != null) {
            a.putBundle("effect_textures", bundle);
        }
        try {
            CameraEffectArguments cameraEffectArguments = shareCameraEffectContent.f59235b;
            if (cameraEffectArguments == null) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                for (String str : cameraEffectArguments.f59230a.keySet()) {
                    Object a2 = CameraEffectArguments.m47897a(cameraEffectArguments.f59230a, str);
                    if (a2 != null) {
                        C24936b.AbstractC24940a aVar = C24936b.f59204a.get(a2.getClass());
                        if (aVar != null) {
                            aVar.mo40815a(jSONObject, str, a2);
                        } else {
                            throw new IllegalArgumentException("Unsupported type: " + a2.getClass());
                        }
                    }
                }
            }
            if (jSONObject != null) {
                C24693ad.m47249a(a, "effect_arguments", jSONObject.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new C24798j("Unable to create a JSON Object from the provided CameraEffectArguments: " + e.getMessage());
        }
    }
}
