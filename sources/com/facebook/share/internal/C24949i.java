package com.facebook.share.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.share.internal.i */
public final class C24949i {

    /* renamed from: a */
    public static C24951b f59212a;

    /* renamed from: b */
    private static C24951b f59213b;

    /* renamed from: c */
    private static C24951b f59214c;

    static {
        Covode.recordClassIndex(30253);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.share.internal.i$b */
    public static class C24951b {

        /* renamed from: a */
        public boolean f59215a;

        static {
            Covode.recordClassIndex(30255);
        }

        private C24951b() {
        }

        /* renamed from: a */
        public void mo40820a(ShareStoryContent shareStoryContent) {
            C24949i.m47842a(shareStoryContent, this);
        }

        /* synthetic */ C24951b(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo40822a(ShareOpenGraphContent shareOpenGraphContent) {
            this.f59215a = true;
            C24949i.m47837a(shareOpenGraphContent, this);
        }

        /* renamed from: a */
        public void mo40824a(ShareVideoContent shareVideoContent) {
            C24949i.m47843a(shareVideoContent.f59310d);
            SharePhoto sharePhoto = shareVideoContent.f59309c;
            if (sharePhoto != null) {
                mo40823a(sharePhoto);
            }
        }

        /* renamed from: a */
        public void mo40821a(ShareMediaContent shareMediaContent) {
            List<ShareMedia> list = shareMediaContent.f59263a;
            if (list == null || list.isEmpty()) {
                throw new C24798j("Must specify at least one medium in ShareMediaContent.");
            } else if (list.size() <= 6) {
                for (ShareMedia shareMedia : list) {
                    C24949i.m47831a(shareMedia, this);
                }
            } else {
                throw new C24798j(C1764a.m5929a(Locale.ROOT, "Cannot add more than %d media.", new Object[]{6}));
            }
        }

        /* renamed from: a */
        public void mo40823a(SharePhoto sharePhoto) {
            C24949i.m47840a(sharePhoto);
            Bitmap bitmap = sharePhoto.f59291b;
            Uri uri = sharePhoto.f59292c;
            if (bitmap == null && C24693ad.m47269b(uri) && !this.f59215a) {
                throw new C24798j("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            } else if (sharePhoto.f59291b != null || !C24693ad.m47269b(sharePhoto.f59292c)) {
                C24699ae.m47299a();
                Context context = C24872m.f59047g;
                C24699ae.m47301a((Object) context, "context");
                String b = C24699ae.m47305b();
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    String concat = "com.facebook.app.FacebookContentProvider".concat(String.valueOf(b));
                    if (packageManager.resolveContentProvider(concat, 0) == null) {
                        throw new IllegalStateException(C1764a.m5928a("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[]{concat}));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m47842a(ShareStoryContent shareStoryContent, C24951b bVar) {
        if (shareStoryContent == null || (shareStoryContent.f59301a == null && shareStoryContent.f59302b == null)) {
            throw new C24798j("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.f59301a != null) {
            m47831a(shareStoryContent.f59301a, bVar);
        }
        if (shareStoryContent.f59302b != null) {
            bVar.mo40823a(shareStoryContent.f59302b);
        }
    }

    /* renamed from: a */
    private static void m47841a(SharePhotoContent sharePhotoContent, C24951b bVar) {
        List<SharePhoto> list = sharePhotoContent.f59299a;
        if (list == null || list.isEmpty()) {
            throw new C24798j("Must specify at least one Photo in SharePhotoContent.");
        } else if (list.size() <= 6) {
            for (SharePhoto sharePhoto : list) {
                bVar.mo40823a(sharePhoto);
            }
        } else {
            throw new C24798j(C1764a.m5929a(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{6}));
        }
    }

    /* renamed from: a */
    static void m47840a(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            Bitmap bitmap = sharePhoto.f59291b;
            Uri uri = sharePhoto.f59292c;
            if (bitmap == null && uri == null) {
                throw new C24798j("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new C24798j("Cannot share a null SharePhoto");
    }

    /* renamed from: a */
    public static void m47843a(ShareVideo shareVideo) {
        if (shareVideo != null) {
            Uri uri = shareVideo.f59305b;
            if (uri == null) {
                throw new C24798j("ShareVideo does not have a LocalUrl specified");
            } else if (!C24693ad.m47275c(uri) && !C24693ad.m47279d(uri)) {
                throw new C24798j("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new C24798j("Cannot share a null ShareVideo");
        }
    }

    /* renamed from: a */
    public static void m47837a(ShareOpenGraphContent shareOpenGraphContent, C24951b bVar) {
        ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f59287a;
        if (shareOpenGraphAction == null) {
            throw new C24798j("Must specify a non-null ShareOpenGraphAction");
        } else if (!C24693ad.m47261a(shareOpenGraphAction.mo40871b("og:type"))) {
            m47839a(shareOpenGraphAction, bVar, false);
            String str = shareOpenGraphContent.f59288b;
            if (C24693ad.m47261a(str)) {
                throw new C24798j("Must specify a previewPropertyName.");
            } else if (shareOpenGraphContent.f59287a.mo40870a(str) == null) {
                throw new C24798j("Property \"" + str + "\" was not found on the action. The name of the preview property must match the name of an action property.");
            }
        } else {
            throw new C24798j("ShareOpenGraphAction must have a non-empty actionType");
        }
    }

    /* renamed from: a */
    private static void m47835a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (C24693ad.m47261a(shareMessengerOpenGraphMusicTemplateContent.f59240k)) {
            throw new C24798j("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (shareMessengerOpenGraphMusicTemplateContent.f59279a != null) {
            m47832a(shareMessengerOpenGraphMusicTemplateContent.f59280b);
        } else {
            throw new C24798j("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
    }

    /* renamed from: a */
    private static void m47834a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (C24693ad.m47261a(shareMessengerMediaTemplateContent.f59240k)) {
            throw new C24798j("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.f59276c != null || !C24693ad.m47261a(shareMessengerMediaTemplateContent.f59275b)) {
            m47832a(shareMessengerMediaTemplateContent.f59277d);
        } else {
            throw new C24798j("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
    }

    /* renamed from: a */
    private static void m47844a(Object obj, C24951b bVar) {
        if (obj instanceof ShareOpenGraphObject) {
            m47838a((ShareOpenGraphObject) obj, bVar);
        } else if (obj instanceof SharePhoto) {
            bVar.mo40823a((SharePhoto) obj);
        }
    }

    /* renamed from: a */
    private static void m47838a(ShareOpenGraphObject shareOpenGraphObject, C24951b bVar) {
        if (shareOpenGraphObject != null) {
            m47839a(shareOpenGraphObject, bVar, true);
            return;
        }
        throw new C24798j("Cannot share a null ShareOpenGraphObject");
    }

    /* renamed from: a */
    private static void m47839a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, C24951b bVar, boolean z) {
        for (String str : shareOpenGraphValueContainer.f59289a.keySet()) {
            if (z) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    for (String str2 : split) {
                        if (str2.isEmpty()) {
                            throw new C24798j("Invalid key found in Open Graph dictionary: %s", str);
                        }
                    }
                } else {
                    throw new C24798j("Open Graph keys must be namespaced: %s", str);
                }
            }
            Object a = shareOpenGraphValueContainer.mo40870a(str);
            if (a instanceof List) {
                for (Object obj : (List) a) {
                    if (obj != null) {
                        m47844a(obj, bVar);
                    } else {
                        throw new C24798j("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
                continue;
            } else {
                m47844a(a, bVar);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.i$a */
    public static class C24950a extends C24951b {
        static {
            Covode.recordClassIndex(30254);
        }

        private C24950a() {
            super((byte) 0);
        }

        public /* synthetic */ C24950a(byte b) {
            this();
        }

        @Override // com.facebook.share.internal.C24949i.C24951b
        /* renamed from: a */
        public final void mo40820a(ShareStoryContent shareStoryContent) {
            C24949i.m47842a(shareStoryContent, (C24951b) this);
        }
    }

    /* renamed from: com.facebook.share.internal.i$c */
    static class C24952c extends C24951b {
        static {
            Covode.recordClassIndex(30256);
        }

        private C24952c() {
            super((byte) 0);
        }

        /* synthetic */ C24952c(byte b) {
            this();
        }

        @Override // com.facebook.share.internal.C24949i.C24951b
        /* renamed from: a */
        public final void mo40823a(SharePhoto sharePhoto) {
            C24949i.m47840a(sharePhoto);
        }

        @Override // com.facebook.share.internal.C24949i.C24951b
        /* renamed from: a */
        public final void mo40821a(ShareMediaContent shareMediaContent) {
            throw new C24798j("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.C24949i.C24951b
        /* renamed from: a */
        public final void mo40824a(ShareVideoContent shareVideoContent) {
            throw new C24798j("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    /* renamed from: a */
    private static void m47836a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.f59281b == null) {
            throw new C24798j("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* renamed from: a */
    private static void m47827a(ShareCameraEffectContent shareCameraEffectContent) {
        if (C24693ad.m47261a(shareCameraEffectContent.f59234a)) {
            throw new C24798j("Must specify a non-empty effectId");
        }
    }

    /* renamed from: b */
    public static void m47845b(ShareContent shareContent) {
        if (f59213b == null) {
            f59213b = new C24952c((byte) 0);
        }
        m47829a(shareContent, f59213b);
    }

    /* renamed from: a */
    public static void m47828a(ShareContent shareContent) {
        if (f59214c == null) {
            f59214c = new C24951b((byte) 0);
        }
        m47829a(shareContent, f59214c);
    }

    /* renamed from: a */
    private static void m47830a(ShareLinkContent shareLinkContent) {
        Uri uri = shareLinkContent.f59253c;
        if (uri != null && !C24693ad.m47269b(uri)) {
            throw new C24798j("Image Url must be an http:// or https:// url");
        }
    }

    /* renamed from: a */
    private static void m47832a(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton != null) {
            if (C24693ad.m47261a(shareMessengerActionButton.f59264a)) {
                throw new C24798j("Must specify title for ShareMessengerActionButton");
            } else if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                m47836a((ShareMessengerURLActionButton) shareMessengerActionButton);
            }
        }
    }

    /* renamed from: a */
    private static void m47833a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (C24693ad.m47261a(shareMessengerGenericTemplateContent.f59240k)) {
            throw new C24798j("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.f59267c == null) {
            throw new C24798j("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (!C24693ad.m47261a(shareMessengerGenericTemplateContent.f59267c.f59269a)) {
            m47832a(shareMessengerGenericTemplateContent.f59267c.f59273e);
        } else {
            throw new C24798j("Must specify title for ShareMessengerGenericTemplateElement");
        }
    }

    /* renamed from: a */
    public static void m47829a(ShareContent shareContent, C24951b bVar) {
        if (shareContent == null) {
            throw new C24798j("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            m47830a((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            m47841a((SharePhotoContent) shareContent, bVar);
        } else if (shareContent instanceof ShareVideoContent) {
            bVar.mo40824a((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            bVar.mo40822a((ShareOpenGraphContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            bVar.mo40821a((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            m47827a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            m47835a((ShareMessengerOpenGraphMusicTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            m47834a((ShareMessengerMediaTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            m47833a((ShareMessengerGenericTemplateContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            bVar.mo40820a((ShareStoryContent) shareContent);
        }
    }

    /* renamed from: a */
    public static void m47831a(ShareMedia shareMedia, C24951b bVar) {
        if (shareMedia instanceof SharePhoto) {
            bVar.mo40823a((SharePhoto) shareMedia);
        } else if (shareMedia instanceof ShareVideo) {
            m47843a((ShareVideo) shareMedia);
        } else {
            throw new C24798j(C1764a.m5929a(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
        }
    }
}
