package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

public final class Hashtag {
    public static final C9512a Companion = new C9512a((byte) 0);
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public Long f23083id;
    @AbstractC27891c(mo46611a = "image")
    public ImageModel image;
    @AbstractC27891c(mo46611a = "title")
    public String title;

    static {
        Covode.recordClassIndex(11039);
    }

    public Hashtag() {
        this(null, null, null, 7, null);
    }

    /* renamed from: com.bytedance.android.livesdk.model.Hashtag$a */
    public static final class C9512a {
        static {
            Covode.recordClassIndex(11040);
        }

        private C9512a() {
        }

        public /* synthetic */ C9512a(byte b) {
            this();
        }
    }

    public final String toString() {
        return "Hashtag(id=" + this.f23083id + ", title=" + this.title + ", image=" + this.image + ')';
    }

    public Hashtag(Long l, String str, ImageModel imageModel) {
        this.f23083id = l;
        this.title = str;
        this.image = imageModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hashtag(Long l, String str, ImageModel imageModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : imageModel);
    }
}
