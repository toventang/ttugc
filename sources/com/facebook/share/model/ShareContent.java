package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.AbstractC24973a;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E extends AbstractC24973a> implements ShareModel {

    /* renamed from: h */
    public final Uri f59237h;

    /* renamed from: i */
    public final List<String> f59238i;

    /* renamed from: j */
    public final String f59239j;

    /* renamed from: k */
    public final String f59240k;

    /* renamed from: l */
    public final String f59241l;

    /* renamed from: m */
    public final ShareHashtag f59242m;

    static {
        Covode.recordClassIndex(30280);
    }

    public int describeContents() {
        return 0;
    }

    protected ShareContent(AbstractC24973a aVar) {
        this.f59237h = aVar.f59243a;
        this.f59238i = aVar.f59244b;
        this.f59239j = aVar.f59245c;
        this.f59240k = aVar.f59246d;
        this.f59241l = aVar.f59247e;
        this.f59242m = aVar.f59248f;
    }

    /* renamed from: com.facebook.share.model.ShareContent$a */
    public static abstract class AbstractC24973a<P extends ShareContent, E extends AbstractC24973a> {

        /* renamed from: a */
        public Uri f59243a;

        /* renamed from: b */
        public List<String> f59244b;

        /* renamed from: c */
        public String f59245c;

        /* renamed from: d */
        public String f59246d;

        /* renamed from: e */
        public String f59247e;

        /* renamed from: f */
        public ShareHashtag f59248f;

        static {
            Covode.recordClassIndex(30281);
        }

        /* renamed from: a */
        public E mo40835a(P p) {
            List<String> unmodifiableList;
            if (p == null) {
                return this;
            }
            this.f59243a = p.f59237h;
            List<String> list = p.f59238i;
            if (list == null) {
                unmodifiableList = null;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f59244b = unmodifiableList;
            this.f59245c = p.f59239j;
            this.f59246d = p.f59240k;
            this.f59247e = p.f59241l;
            this.f59248f = p.f59242m;
            return this;
        }
    }

    public ShareContent(Parcel parcel) {
        List<String> unmodifiableList;
        this.f59237h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f59238i = unmodifiableList;
        this.f59239j = parcel.readString();
        this.f59240k = parcel.readString();
        this.f59241l = parcel.readString();
        ShareHashtag.C24975a aVar = new ShareHashtag.C24975a();
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            aVar.f59250a = shareHashtag.f59249a;
        }
        this.f59242m = new ShareHashtag(aVar, (byte) 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f59237h, 0);
        parcel.writeStringList(this.f59238i);
        parcel.writeString(this.f59239j);
        parcel.writeString(this.f59240k);
        parcel.writeString(this.f59241l);
        parcel.writeParcelable(this.f59242m, 0);
    }
}
