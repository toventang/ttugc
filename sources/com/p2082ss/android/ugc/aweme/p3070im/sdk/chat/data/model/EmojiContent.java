package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46641c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent */
public class EmojiContent extends BaseContent {
    private static String bigEmojiMessageHint = "";
    @AbstractC27891c(mo46611a = "display_name")
    private String displayName;
    @AbstractC27891c(mo46611a = "height")
    int height;
    @AbstractC27891c(mo46611a = "image_id")
    private long imageId;
    @AbstractC27891c(mo46611a = "image_type")
    private String imageType;
    @AbstractC27891c(mo46611a = "package_id")
    private long packageId;
    @AbstractC27891c(mo46611a = "sticker_id")
    private String stickerId;
    private boolean updateConversationTime = true;
    @AbstractC27891c(mo46611a = "url")
    UrlModel url;
    @AbstractC27891c(mo46611a = "version")
    private String version;
    @AbstractC27891c(mo46611a = "width")
    int width;

    public String getDisplayName() {
        return this.displayName;
    }

    public int getHeight() {
        return this.height;
    }

    public long getImageId() {
        return this.imageId;
    }

    public String getImageType() {
        return this.imageType;
    }

    public long getPackageId() {
        return this.packageId;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isUpdateConversationTime() {
        return this.updateConversationTime;
    }

    static {
        Covode.recordClassIndex(63430);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.PreloadFetcher, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public List<UrlModel> fetchPreload() {
        UrlModel urlModel = this.url;
        if (urlModel == null) {
            return null;
        }
        return Collections.singletonList(urlModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("gif");
        Bundle bundle = a.f155492i;
        bundle.putSerializable("video_cover", getUrl());
        bundle.putInt("aweme_type", getType());
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public void tryInit() {
        Context a;
        if (TextUtils.isEmpty(bigEmojiMessageHint) && (a = C17867d.m33078a()) != null) {
            bigEmojiMessageHint = a.getString(R.string.cc9);
        }
    }

    public UrlModel getLocalUrl() {
        String a;
        if (getType() == 502) {
            return null;
        }
        if (getType() == 501) {
            a = C46641c.m90024a(0, "0", this.imageId, this.imageType);
        } else {
            a = C46641c.m90024a(this.packageId, this.version, this.imageId, this.imageType);
        }
        if (!new File(a).exists()) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add("file://".concat(String.valueOf(a)));
        urlModel.setUrlList(arrayList);
        urlModel.setUri("file://".concat(String.valueOf(a)));
        return urlModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        if (501 == getType()) {
            return "[" + C17867d.m33078a().getString(R.string.cdj) + "]";
        }
        if (!C13627m.m24498a(getDisplayName())) {
            return "[" + getDisplayName() + "]";
        }
        super.getMsgHint();
        return bigEmojiMessageHint;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageId(long j) {
        this.imageId = j;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public void setPackageId(long j) {
        this.packageId = j;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setUpdateConversationTime(boolean z) {
        this.updateConversationTime = z;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        if (this.type == 502) {
            return context.getResources().getString(R.string.cfy);
        }
        return context.getResources().getString(R.string.cg5);
    }

    public static EmojiContent obtain(C46534a aVar) {
        EmojiContent emojiContent = new EmojiContent();
        emojiContent.setUrl(aVar.getAnimateUrl());
        emojiContent.setImageId(aVar.getId());
        emojiContent.setDisplayName(C46459a.m89690b(aVar));
        emojiContent.setImageType(aVar.getAnimateType());
        emojiContent.setPackageId(aVar.getResourcesId());
        emojiContent.setVersion(aVar.getVersion());
        emojiContent.setWidth(aVar.getWidth());
        emojiContent.setHeight(aVar.getHeight());
        if (aVar.getStickerType() == 2) {
            emojiContent.setType(501);
        } else if (aVar.getStickerType() == 3) {
            emojiContent.setType(502);
            emojiContent.setStickerId(aVar.getStickerId());
        } else {
            emojiContent.setType(500);
        }
        return emojiContent;
    }

    public static EmojiContent obtain(C46534a aVar, int i) {
        EmojiContent obtain = obtain(aVar);
        obtain.setType(i);
        return obtain;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z2) {
            return a.getString(R.string.a_e);
        }
        if (z) {
            return a.getString(R.string.a_e);
        }
        return a.getString(R.string.fi4);
    }
}
