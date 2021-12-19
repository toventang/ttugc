package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C28027t;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c */
public final class C72890c {
    static {
        Covode.recordClassIndex(85585);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$a */
    public static final class C72891a extends C27895a<List<? extends NormalTrackTimeStamp>> {
        static {
            Covode.recordClassIndex(85586);
        }

        C72891a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$b */
    public static final class C72892b extends C27895a<List<? extends NormalTrackTimeStamp>> {
        static {
            Covode.recordClassIndex(85587);
        }

        C72892b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$c */
    public static final class C72893c extends C27895a<List<? extends NormalTrackTimeStamp>> {
        static {
            Covode.recordClassIndex(85588);
        }

        C72893c() {
        }
    }

    /* renamed from: a */
    public static final boolean m128720a(Context context) {
        C89219l.m154721d(context, "");
        return C34822d.m71158a(context, "test_data", 0).getBoolean("sp_interact_stickers_test", false);
    }

    /* renamed from: b */
    public static final StickerAttrStruct m128722b(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct == null) {
            return null;
        }
        try {
            return (StickerAttrStruct) GsonHolder.m138943c().mo123620b().mo46670a(interactStickerStruct.getAttr(), StickerAttrStruct.class);
        } catch (C28027t unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final String m128716a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
            return aweme.getAid();
        }
        Aweme forwardItem = aweme.getForwardItem();
        C89219l.m154716b(forwardItem, "");
        return forwardItem.getAid();
    }

    /* renamed from: b */
    public static final User m128721b(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
            return aweme.getAuthor();
        }
        Aweme forwardItem = aweme.getForwardItem();
        C89219l.m154716b(forwardItem, "");
        return forwardItem.getAuthor();
    }

    /* renamed from: a */
    public static final String m128717a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, "webview")) {
            return "web_url";
        }
        return "open_url";
    }

    /* renamed from: a */
    public static final List<NormalTrackTimeStamp> m128719a(InteractStickerStruct interactStickerStruct) {
        List<NormalTrackTimeStamp> list;
        String str;
        try {
            C27910f b = GsonHolder.m138943c().mo123620b();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            list = (List) b.mo46671a(str, new C72892b().type);
        } catch (C28027t e) {
            C51423a.m95787a("InteractStickerUtils.kt : e ".concat(String.valueOf(e)));
            list = null;
        }
        if (C13603b.m24435a((Collection) list)) {
            return null;
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r3.getEndTime() >= r1) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp> m128723b(long r7, com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct r9) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c.m128723b(long, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):java.util.List");
    }

    /* renamed from: a */
    public static final List<NormalTrackTimeStamp> m128718a(long j, InteractStickerStruct interactStickerStruct) {
        List list;
        long j2;
        boolean z;
        try {
            list = (List) GsonHolder.m138943c().mo123620b().mo46671a(interactStickerStruct != null ? interactStickerStruct.getTrackList() : null, new C72891a().type);
        } catch (C28027t e) {
            C51423a.m95787a("InteractStickerUtils.kt : e ".concat(String.valueOf(e)));
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BaseTrackTimeStamp baseTrackTimeStamp = (BaseTrackTimeStamp) obj;
            if (baseTrackTimeStamp != null) {
                j2 = (long) baseTrackTimeStamp.getPts();
            } else {
                j2 = 0;
            }
            long j3 = j - j2;
            if (-160 <= j3 && 160 >= j3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
