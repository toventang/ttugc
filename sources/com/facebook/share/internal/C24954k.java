package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.facebook.AbstractC24311h;
import com.facebook.AccessToken;
import com.facebook.C24798j;
import com.facebook.C24815l;
import com.facebook.C24872m;
import com.facebook.EnumC24916s;
import com.facebook.GraphRequest;
import com.facebook.internal.C24667a;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24784x;
import com.facebook.internal.C24786y;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23998m;
import com.facebook.share.AbstractC24917a;
import com.facebook.share.internal.C24946g;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.k */
public final class C24954k {
    static {
        Covode.recordClassIndex(30258);
    }

    /* renamed from: a */
    static /* synthetic */ C24784x.C24785a m47862a(UUID uuid, ShareMedia shareMedia) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            return m47878b(uuid, shareMedia);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    public static String m47865a(Bundle bundle) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            if (bundle.containsKey("completionGesture")) {
                return bundle.getString("completionGesture");
            }
            return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m47876a(int i, Intent intent, AbstractC24948h hVar) {
        if (C24677a.m47209a(C24954k.class)) {
            return false;
        }
        try {
            C24667a a = m47860a(i, intent);
            if (a == null) {
                return false;
            }
            File a2 = C24784x.m47455a(a.mo40497b(), false);
            if (a2 != null) {
                C24693ad.m47252a(a2);
            }
            if (hVar == null) {
                return true;
            }
            C24798j a3 = C24786y.m47470a(C24786y.m47485d(intent));
            if (a3 == null) {
                hVar.mo40818a(C24786y.m47483c(intent));
            } else if (a3 instanceof C24815l) {
                hVar.mo40817a();
            } else {
                hVar.mo40819a(a3);
            }
            return true;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return false;
        }
    }

    /* renamed from: a */
    public static AbstractC24948h m47863a() {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            return new AbstractC24948h() {
                /* class com.facebook.share.internal.C24954k.C249551 */

                /* renamed from: a */
                final /* synthetic */ AbstractC24311h f59218a = null;

                static {
                    Covode.recordClassIndex(30259);
                }

                @Override // com.facebook.share.internal.AbstractC24948h
                /* renamed from: a */
                public final void mo40817a() {
                    C24954k.m47873a(this.f59218a);
                }

                @Override // com.facebook.share.internal.AbstractC24948h
                /* renamed from: a */
                public final void mo40819a(C24798j jVar) {
                    C24954k.m47874a(this.f59218a, jVar);
                }

                @Override // com.facebook.share.internal.AbstractC24948h
                /* renamed from: a */
                public final void mo40818a(Bundle bundle) {
                    if (bundle != null) {
                        String a = C24954k.m47865a(bundle);
                        if (a == null || UGCMonitor.TYPE_POST.equalsIgnoreCase(a)) {
                            String b = C24954k.m47879b(bundle);
                            AbstractC24311h hVar = this.f59218a;
                            if (!C24677a.m47209a(C24954k.class)) {
                                try {
                                    C24954k.m47875a("succeeded", (String) null);
                                    if (hVar != null) {
                                        hVar.mo34344a(new AbstractC24917a.C24918a(b));
                                    }
                                } catch (Throwable th) {
                                    C24677a.m47208a(th, C24954k.class);
                                }
                            }
                        } else if ("cancel".equalsIgnoreCase(a)) {
                            C24954k.m47873a(this.f59218a);
                        } else {
                            C24954k.m47874a(this.f59218a, new C24798j("UnknownError"));
                        }
                    }
                }
            };
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    public static List<String> m47868a(SharePhotoContent sharePhotoContent, final UUID uuid) {
        if (!C24677a.m47209a(C24954k.class) && sharePhotoContent != null) {
            try {
                List<SharePhoto> list = sharePhotoContent.f59299a;
                if (list != null) {
                    List a = C24693ad.m47242a((List) list, (C24693ad.AbstractC24697b) new C24693ad.AbstractC24697b<SharePhoto, C24784x.C24785a>() {
                        /* class com.facebook.share.internal.C24954k.C249605 */

                        static {
                            Covode.recordClassIndex(30264);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.C24693ad.AbstractC24697b
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ C24784x.C24785a mo40516a(SharePhoto sharePhoto) {
                            return C24954k.m47862a(uuid, sharePhoto);
                        }
                    });
                    List<String> a2 = C24693ad.m47242a(a, (C24693ad.AbstractC24697b) new C24693ad.AbstractC24697b<C24784x.C24785a, String>() {
                        /* class com.facebook.share.internal.C24954k.C249616 */

                        static {
                            Covode.recordClassIndex(30265);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.C24693ad.AbstractC24697b
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ String mo40516a(C24784x.C24785a aVar) {
                            return aVar.f58812b;
                        }
                    });
                    C24784x.m47456a(a);
                    return a2;
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m47866a(ShareVideoContent shareVideoContent, UUID uuid) {
        if (!C24677a.m47209a(C24954k.class) && shareVideoContent != null) {
            try {
                if (shareVideoContent.f59310d != null) {
                    C24784x.C24785a a = C24784x.m47451a(uuid, shareVideoContent.f59310d.f59305b);
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(a);
                    C24784x.m47456a(arrayList);
                    return a.f58812b;
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<Bundle> m47867a(ShareMediaContent shareMediaContent, final UUID uuid) {
        if (!C24677a.m47209a(C24954k.class) && shareMediaContent != null) {
            try {
                List<ShareMedia> list = shareMediaContent.f59263a;
                if (list != null) {
                    final ArrayList arrayList = new ArrayList();
                    List<Bundle> a = C24693ad.m47242a((List) list, (C24693ad.AbstractC24697b) new C24693ad.AbstractC24697b<ShareMedia, Bundle>() {
                        /* class com.facebook.share.internal.C24954k.C249627 */

                        static {
                            Covode.recordClassIndex(30266);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.C24693ad.AbstractC24697b
                        /* renamed from: a */
                        public final /* synthetic */ Bundle mo40516a(ShareMedia shareMedia) {
                            ShareMedia shareMedia2 = shareMedia;
                            C24784x.C24785a a = C24954k.m47862a(uuid, shareMedia2);
                            arrayList.add(a);
                            Bundle bundle = new Bundle();
                            bundle.putString(StringSet.type, shareMedia2.mo40842a().name());
                            bundle.putString("uri", a.f58812b);
                            return bundle;
                        }
                    });
                    C24784x.m47456a(arrayList);
                    return a;
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONObject m47871a(final UUID uuid, ShareOpenGraphContent shareOpenGraphContent) {
        Set c;
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f59287a;
            final ArrayList arrayList = new ArrayList();
            JSONObject a = C24946g.m47821a(shareOpenGraphAction, (C24946g.AbstractC24947a) new C24946g.AbstractC24947a() {
                /* class com.facebook.share.internal.C24954k.C249638 */

                static {
                    Covode.recordClassIndex(30267);
                }

                @Override // com.facebook.share.internal.C24946g.AbstractC24947a
                /* renamed from: a */
                public final JSONObject mo40816a(SharePhoto sharePhoto) {
                    C24784x.C24785a a = C24954k.m47862a(uuid, sharePhoto);
                    if (a == null) {
                        return null;
                    }
                    arrayList.add(a);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", a.f58812b);
                        if (sharePhoto.f59293d) {
                            jSONObject.put("user_generated", true);
                        }
                        return jSONObject;
                    } catch (JSONException e) {
                        throw new C24798j("Unable to attach images", e);
                    }
                }
            });
            C24784x.m47456a(arrayList);
            if (shareOpenGraphContent.f59239j != null && C24693ad.m47261a(a.optString("place"))) {
                a.put("place", shareOpenGraphContent.f59239j);
            }
            if (shareOpenGraphContent.f59238i != null) {
                JSONArray optJSONArray = a.optJSONArray("tags");
                if (optJSONArray == null) {
                    c = new HashSet();
                } else {
                    c = C24693ad.m47274c(optJSONArray);
                }
                for (String str : shareOpenGraphContent.f59238i) {
                    c.add(str);
                }
                a.put("tags", new JSONArray((Collection) c));
            }
            return a;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m47870a(ShareOpenGraphContent shareOpenGraphContent) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            return C24946g.m47821a(shareOpenGraphContent.f59287a, (C24946g.AbstractC24947a) new C24946g.AbstractC24947a() {
                /* class com.facebook.share.internal.C24954k.C249649 */

                static {
                    Covode.recordClassIndex(30268);
                }

                @Override // com.facebook.share.internal.C24946g.AbstractC24947a
                /* renamed from: a */
                public final JSONObject mo40816a(SharePhoto sharePhoto) {
                    Uri uri = sharePhoto.f59292c;
                    if (C24693ad.m47269b(uri)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("url", uri.toString());
                            return jSONObject;
                        } catch (JSONException e) {
                            throw new C24798j("Unable to attach images", e);
                        }
                    } else {
                        throw new C24798j("Only web images may be used in OG objects shared via the web dialog");
                    }
                }
            });
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONArray m47869a(JSONArray jSONArray, boolean z) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = m47869a((JSONArray) obj, z);
                } else if (obj instanceof JSONObject) {
                    obj = m47872a((JSONObject) obj, z);
                }
                jSONArray2.put(obj);
            }
            return jSONArray2;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:36|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        throw new com.facebook.C24798j("Failed to create json object from share content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r0, com.facebook.share.internal.C24954k.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x008e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m47872a(org.json.JSONObject r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C24954k.m47872a(org.json.JSONObject, boolean):org.json.JSONObject");
    }

    /* renamed from: a */
    static void m47873a(AbstractC24311h<AbstractC24917a.C24918a> hVar) {
        if (!C24677a.m47209a(C24954k.class)) {
            try {
                m47875a("cancelled", (String) null);
                if (hVar != null) {
                    hVar.mo34345c();
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
    }

    /* renamed from: a */
    static void m47874a(AbstractC24311h<AbstractC24917a.C24918a> hVar, C24798j jVar) {
        if (!C24677a.m47209a(C24954k.class)) {
            try {
                m47875a("error", jVar.getMessage());
                if (hVar != null) {
                    hVar.mo34343a(jVar);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
    }

    /* renamed from: a */
    public static String m47864a(Uri uri) {
        if (C24677a.m47209a(C24954k.class) || uri == null) {
            return null;
        }
        try {
            String uri2 = uri.toString();
            int lastIndexOf = uri2.lastIndexOf(46);
            if (lastIndexOf == -1) {
                return null;
            }
            return uri2.substring(lastIndexOf);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    static void m47875a(String str, String str2) {
        if (!C24677a.m47209a(C24954k.class)) {
            try {
                C24699ae.m47299a();
                C23998m mVar = new C23998m(C24872m.f59047g);
                Bundle bundle = new Bundle();
                bundle.putString("fb_share_dialog_outcome", str);
                if (str2 != null) {
                    bundle.putString("error_message", str2);
                }
                mVar.mo39478d();
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m47857a(String str) {
        String str2;
        int i;
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
                str2 = null;
            } else {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
            }
            return new Pair<>(str2, str);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: b */
    public static String m47879b(Bundle bundle) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            if (bundle.containsKey("postId")) {
                return bundle.getString("postId");
            }
            if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
                return bundle.getString("com.facebook.platform.extra.POST_ID");
            }
            return bundle.getString("post_id");
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    private static C24667a m47860a(int i, Intent intent) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            UUID a = C24786y.m47473a(intent);
            if (a == null) {
                return null;
            }
            return C24667a.m47189a(a, i);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m47856a(ShareStoryContent shareStoryContent, final UUID uuid) {
        if (!C24677a.m47209a(C24954k.class) && shareStoryContent != null) {
            try {
                if (shareStoryContent.f59302b != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shareStoryContent.f59302b);
                    List a = C24693ad.m47242a((List) arrayList, (C24693ad.AbstractC24697b) new C24693ad.AbstractC24697b<SharePhoto, C24784x.C24785a>() {
                        /* class com.facebook.share.internal.C24954k.C2495610 */

                        static {
                            Covode.recordClassIndex(30260);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.C24693ad.AbstractC24697b
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ C24784x.C24785a mo40516a(SharePhoto sharePhoto) {
                            return C24954k.m47862a(uuid, sharePhoto);
                        }
                    });
                    List a2 = C24693ad.m47242a(a, (C24693ad.AbstractC24697b) new C24693ad.AbstractC24697b<C24784x.C24785a, Bundle>() {
                        /* class com.facebook.share.internal.C24954k.C249572 */

                        static {
                            Covode.recordClassIndex(30261);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.C24693ad.AbstractC24697b
                        /* renamed from: a */
                        public final /* synthetic */ Bundle mo40516a(C24784x.C24785a aVar) {
                            C24784x.C24785a aVar2 = aVar;
                            Bundle bundle = new Bundle();
                            bundle.putString("uri", aVar2.f58812b);
                            String a = C24954k.m47864a(aVar2.f58815e);
                            if (a != null) {
                                C24693ad.m47249a(bundle, "extension", a);
                            }
                            return bundle;
                        }
                    });
                    C24784x.m47456a(a);
                    return (Bundle) a2.get(0);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Bundle m47877b(ShareStoryContent shareStoryContent, final UUID uuid) {
        if (!C24677a.m47209a(C24954k.class) && shareStoryContent != null) {
            try {
                if (shareStoryContent.f59301a != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shareStoryContent.f59301a);
                    final ArrayList arrayList2 = new ArrayList();
                    List a = C24693ad.m47242a((List) arrayList, (C24693ad.AbstractC24697b) new C24693ad.AbstractC24697b<ShareMedia, Bundle>() {
                        /* class com.facebook.share.internal.C24954k.C249583 */

                        static {
                            Covode.recordClassIndex(30262);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.C24693ad.AbstractC24697b
                        /* renamed from: a */
                        public final /* synthetic */ Bundle mo40516a(ShareMedia shareMedia) {
                            ShareMedia shareMedia2 = shareMedia;
                            C24784x.C24785a a = C24954k.m47862a(uuid, shareMedia2);
                            arrayList2.add(a);
                            Bundle bundle = new Bundle();
                            bundle.putString(StringSet.type, shareMedia2.mo40842a().name());
                            bundle.putString("uri", a.f58812b);
                            String a2 = C24954k.m47864a(a.f58815e);
                            if (a2 != null) {
                                C24693ad.m47249a(bundle, "extension", a2);
                            }
                            return bundle;
                        }
                    });
                    C24784x.m47456a(arrayList2);
                    return (Bundle) a.get(0);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Bundle m47855a(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        if (!C24677a.m47209a(C24954k.class) && shareCameraEffectContent != null) {
            try {
                CameraEffectTextures cameraEffectTextures = shareCameraEffectContent.f59236c;
                if (cameraEffectTextures != null) {
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    for (String str : cameraEffectTextures.f59232a.keySet()) {
                        Object a = CameraEffectTextures.m47898a(cameraEffectTextures.f59232a, str);
                        Uri uri = a instanceof Uri ? (Uri) a : null;
                        Object a2 = CameraEffectTextures.m47898a(cameraEffectTextures.f59232a, str);
                        C24784x.C24785a a3 = m47861a(uuid, uri, a2 instanceof Bitmap ? (Bitmap) a2 : null);
                        arrayList.add(a3);
                        bundle.putString(str, a3.f58812b);
                    }
                    C24784x.m47456a(arrayList);
                    return bundle;
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static C24784x.C24785a m47878b(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap;
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            if (shareMedia instanceof SharePhoto) {
                SharePhoto sharePhoto = (SharePhoto) shareMedia;
                bitmap = sharePhoto.f59291b;
                uri = sharePhoto.f59292c;
            } else if (shareMedia instanceof ShareVideo) {
                uri = ((ShareVideo) shareMedia).f59305b;
                bitmap = null;
            } else {
                uri = null;
                bitmap = null;
            }
            return m47861a(uuid, uri, bitmap);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    public static GraphRequest m47858a(AccessToken accessToken, Uri uri, GraphRequest.AbstractC23858b bVar) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            if (C24693ad.m47279d(uri)) {
                return m47859a(accessToken, new File(uri.getPath()), bVar);
            }
            if (C24693ad.m47275c(uri)) {
                GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("file", parcelableResourceWithMimeType);
                return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC24916s.POST, bVar);
            }
            throw new C24798j("The image Uri must be either a file:// or content:// Uri");
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    private static GraphRequest m47859a(AccessToken accessToken, File file, GraphRequest.AbstractC23858b bVar) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        try {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC24916s.POST, bVar);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24954k.class);
            return null;
        }
    }

    /* renamed from: a */
    private static C24784x.C24785a m47861a(UUID uuid, Uri uri, Bitmap bitmap) {
        if (C24677a.m47209a(C24954k.class)) {
            return null;
        }
        if (bitmap != null) {
            try {
                return C24784x.m47450a(uuid, bitmap);
            } catch (Throwable th) {
                C24677a.m47208a(th, C24954k.class);
                return null;
            }
        } else if (uri != null) {
            return C24784x.m47451a(uuid, uri);
        } else {
            return null;
        }
    }
}
