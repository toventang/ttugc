package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LineApiError implements Parcelable {
    public static final Parcelable.Creator<LineApiError> CREATOR = new Parcelable.Creator<LineApiError>() {
        /* class com.linecorp.linesdk.LineApiError.C281381 */

        static {
            Covode.recordClassIndex(34077);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineApiError[] newArray(int i) {
            return new LineApiError[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineApiError createFromParcel(Parcel parcel) {
            return new LineApiError(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public static final LineApiError f65847a = new LineApiError(-1, "");

    /* renamed from: b */
    public final int f65848b;

    /* renamed from: c */
    public final String f65849c;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = this.f65848b * 31;
        String str = this.f65849c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    static {
        Covode.recordClassIndex(34076);
    }

    public String toString() {
        return "LineApiError{httpResponseCode=" + this.f65848b + ", message='" + this.f65849c + '\'' + '}';
    }

    private LineApiError(Parcel parcel) {
        this.f65848b = parcel.readInt();
        this.f65849c = parcel.readString();
    }

    /* renamed from: a */
    private static String m56241a(Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public LineApiError(Exception exc) {
        this(-1, m56241a(exc));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineApiError lineApiError = (LineApiError) obj;
            if (this.f65848b != lineApiError.f65848b) {
                return false;
            }
            String str = this.f65849c;
            String str2 = lineApiError.f65849c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public LineApiError(String str) {
        this(-1, str);
    }

    /* synthetic */ LineApiError(Parcel parcel, byte b) {
        this(parcel);
    }

    public LineApiError(int i, Exception exc) {
        this(i, m56241a(exc));
    }

    public LineApiError(int i, String str) {
        this.f65848b = i;
        this.f65849c = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f65848b);
        parcel.writeString(this.f65849c);
    }
}
