package com.p2082ss.android.socialbase.downloader.exception;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;

/* renamed from: com.ss.android.socialbase.downloader.exception.BaseException */
public class BaseException extends Exception implements Parcelable {
    public static final Parcelable.Creator<BaseException> CREATOR = new Parcelable.Creator<BaseException>() {
        /* class com.p2082ss.android.socialbase.downloader.exception.BaseException.C304361 */

        static {
            Covode.recordClassIndex(36956);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BaseException[] newArray(int i) {
            return new BaseException[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BaseException createFromParcel(Parcel parcel) {
            return new BaseException(parcel);
        }
    };

    /* renamed from: a */
    private int f72549a;

    /* renamed from: b */
    private String f72550b;

    /* renamed from: c */
    private String f72551c;

    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.f72549a;
    }

    public String getErrorMessage() {
        return this.f72550b;
    }

    public String getExtraInfo() {
        return this.f72551c;
    }

    public BaseException() {
        this.f72551c = "";
    }

    static {
        Covode.recordClassIndex(36955);
    }

    public String toString() {
        return "BaseException{errorCode=" + this.f72549a + ", errorMsg='" + this.f72550b + '\'' + '}';
    }

    public void setErrorMsg(String str) {
        this.f72550b = str;
    }

    public void setExtraInfo(String str) {
        this.f72551c = str;
    }

    public void readFromParcel(Parcel parcel) {
        this.f72549a = parcel.readInt();
        this.f72550b = parcel.readString();
        this.f72551c = parcel.readString();
    }

    protected BaseException(Parcel parcel) {
        this.f72551c = "";
        readFromParcel(parcel);
    }

    public BaseException(int i, Throwable th) {
        this(i, C30535g.m62604e(th));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f72549a);
        parcel.writeString(this.f72550b);
        parcel.writeString(this.f72551c);
    }

    public BaseException(int i, String str) {
        super("[d-ex]:".concat(String.valueOf(str)));
        this.f72551c = "";
        this.f72550b = "[d-ex]:".concat(String.valueOf(str));
        this.f72549a = i;
    }

    public BaseException(int i, String str, Throwable th) {
        super("[d-ex]:".concat(String.valueOf(str)), th);
        this.f72551c = "";
        this.f72550b = "[d-ex]:".concat(String.valueOf(str));
        this.f72549a = i;
    }
}
