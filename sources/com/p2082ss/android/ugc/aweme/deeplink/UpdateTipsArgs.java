package com.p2082ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.arg.RouteParser;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs */
public final class UpdateTipsArgs implements IRouteArg {
    public static final Parcelable.Creator<UpdateTipsArgs> CREATOR = new C40995b();
    public static final C40994a Companion = new C40994a((byte) 0);
    private String urlToGo;
    private String versionRequire;

    static {
        Covode.recordClassIndex(48856);
    }

    public UpdateTipsArgs() {
        this(null, null, 3, null);
    }

    public static UpdateTipsArgs __fromBundle(Bundle bundle) {
        String str;
        String str2;
        if (bundle == null) {
            return null;
        }
        int i = 0;
        if (bundle.containsKey("debug_url")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("debug_url"), String.class);
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("version_required")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("version_required"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        return new UpdateTipsArgs(str, str2, i, null);
    }

    public static /* synthetic */ UpdateTipsArgs copy$default(UpdateTipsArgs updateTipsArgs, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateTipsArgs.urlToGo;
        }
        if ((i & 2) != 0) {
            str2 = updateTipsArgs.versionRequire;
        }
        return updateTipsArgs.copy(str, str2);
    }

    public final String component1() {
        return this.urlToGo;
    }

    public final String component2() {
        return this.versionRequire;
    }

    public final UpdateTipsArgs copy(String str, String str2) {
        return new UpdateTipsArgs(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateTipsArgs)) {
            return false;
        }
        UpdateTipsArgs updateTipsArgs = (UpdateTipsArgs) obj;
        return C89219l.m154714a(this.urlToGo, updateTipsArgs.urlToGo) && C89219l.m154714a(this.versionRequire, updateTipsArgs.versionRequire);
    }

    public final int hashCode() {
        String str = this.urlToGo;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.versionRequire;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UpdateTipsArgs(urlToGo=" + this.urlToGo + ", versionRequire=" + this.versionRequire + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.urlToGo);
        parcel.writeString(this.versionRequire);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs$a */
    public static final class C40994a {
        static {
            Covode.recordClassIndex(48857);
        }

        private C40994a() {
        }

        public /* synthetic */ C40994a(byte b) {
            this();
        }
    }

    public final String getUrlToGo() {
        return this.urlToGo;
    }

    public final String getVersionRequire() {
        return this.versionRequire;
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs$b */
    public static class C40995b implements Parcelable.Creator<UpdateTipsArgs> {
        static {
            Covode.recordClassIndex(48858);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpdateTipsArgs[] newArray(int i) {
            return new UpdateTipsArgs[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateTipsArgs createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new UpdateTipsArgs(parcel.readString(), parcel.readString());
        }
    }

    public final void setUrlToGo(String str) {
        this.urlToGo = str;
    }

    public final void setVersionRequire(String str) {
        this.versionRequire = str;
    }

    public static final UpdateTipsArgs getOrNew(Activity activity) {
        C89219l.m154721d(activity, "");
        UpdateTipsArgs updateTipsArgs = (UpdateTipsArgs) RouteArgExtension.INSTANCE.navArg(activity).getValue();
        if (updateTipsArgs == null) {
            return new UpdateTipsArgs(null, null, 3, null);
        }
        return updateTipsArgs;
    }

    public UpdateTipsArgs(String str, String str2) {
        this.urlToGo = str;
        this.versionRequire = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateTipsArgs(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
