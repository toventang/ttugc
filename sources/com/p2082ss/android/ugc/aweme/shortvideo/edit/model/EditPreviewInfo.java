package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo */
public final class EditPreviewInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditPreviewInfo> CREATOR = new C71404b();
    public static final C71403a Companion = new C71403a((byte) 0);
    private int calculateHeight;
    private int calculateSourceHeight;
    private int calculateSourceWidth;
    private int calculateWidth;
    private String draftDir;
    private final String initDraftDir;
    private int previewHeight;
    private int previewVideoLength;
    private int previewWidth;
    private String[] reverseAudioArray;
    private String[] reverseVideoArray;
    private long sceneIn;
    private long sceneOut;
    private String[] tempVideoArray;
    private final List<EditVideoSegment> videoList;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo$a */
    public static final class C71403a {
        static {
            Covode.recordClassIndex(83932);
        }

        private C71403a() {
        }

        public /* synthetic */ C71403a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo$b */
    public static final class C71404b implements Parcelable.Creator<EditPreviewInfo> {
        static {
            Covode.recordClassIndex(83933);
        }

        C71404b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditPreviewInfo[] newArray(int i) {
            return new EditPreviewInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditPreviewInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EditPreviewInfo(parcel);
        }
    }

    public final int getCalculateHeight() {
        return this.calculateHeight;
    }

    public final int getCalculateSourceHeight() {
        return this.calculateSourceHeight;
    }

    public final int getCalculateSourceWidth() {
        return this.calculateSourceWidth;
    }

    public final int getCalculateWidth() {
        return this.calculateWidth;
    }

    public final String getDraftDir() {
        return this.draftDir;
    }

    public final int getPreviewHeight() {
        return this.previewHeight;
    }

    public final int getPreviewVideoLength() {
        return this.previewVideoLength;
    }

    public final int getPreviewWidth() {
        return this.previewWidth;
    }

    public final String[] getReverseAudioArray() {
        return this.reverseAudioArray;
    }

    public final String[] getReverseVideoArray() {
        return this.reverseVideoArray;
    }

    public final long getSceneIn() {
        return this.sceneIn;
    }

    public final long getSceneOut() {
        return this.sceneOut;
    }

    public final String[] getTempVideoArray() {
        return this.tempVideoArray;
    }

    public final List<EditVideoSegment> getVideoList() {
        return this.videoList;
    }

    public final String reverseVideo() {
        String[] strArr = this.reverseVideoArray;
        if (strArr != null) {
            return strArr[0];
        }
        return null;
    }

    static {
        Covode.recordClassIndex(83931);
    }

    public final int[] getTotalVideoHeight() {
        List<EditVideoSegment> list = this.videoList;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getVideoFileInfo().getHeight()));
        }
        return C89070n.m154578e((Collection<Integer>) arrayList);
    }

    public final int[] getTotalVideoWidth() {
        List<EditVideoSegment> list = this.videoList;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getVideoFileInfo().getWidth()));
        }
        return C89070n.m154578e((Collection<Integer>) arrayList);
    }

    public final void setCalculateHeight(int i) {
        this.calculateHeight = i;
    }

    public final void setCalculateSourceHeight(int i) {
        this.calculateSourceHeight = i;
    }

    public final void setCalculateSourceWidth(int i) {
        this.calculateSourceWidth = i;
    }

    public final void setCalculateWidth(int i) {
        this.calculateWidth = i;
    }

    public final void setPreviewHeight(int i) {
        this.previewHeight = i;
    }

    public final void setPreviewVideoLength(int i) {
        this.previewVideoLength = i;
    }

    public final void setPreviewWidth(int i) {
        this.previewWidth = i;
    }

    public final void setReverseAudioArray(String[] strArr) {
        this.reverseAudioArray = strArr;
    }

    public final void setReverseVideoArray(String[] strArr) {
        this.reverseVideoArray = strArr;
    }

    public final void setSceneIn(long j) {
        this.sceneIn = j;
    }

    public final void setSceneOut(long j) {
        this.sceneOut = j;
    }

    public final void setTempVideoArray(String[] strArr) {
        this.tempVideoArray = strArr;
    }

    public final EditPreviewInfo cloneWithNewVideos(List<EditVideoSegment> list) {
        C89219l.m154721d(list, "");
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(list, this.previewWidth, this.previewHeight, this.sceneIn, this.sceneOut, this.draftDir);
        editPreviewInfo.calculateWidth = this.calculateWidth;
        editPreviewInfo.calculateHeight = this.calculateHeight;
        editPreviewInfo.previewVideoLength = this.previewVideoLength;
        editPreviewInfo.reverseVideoArray = this.reverseVideoArray;
        editPreviewInfo.reverseAudioArray = this.reverseAudioArray;
        editPreviewInfo.tempVideoArray = this.tempVideoArray;
        return editPreviewInfo;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditPreviewInfo(android.os.Parcel r12) {
        /*
            r11 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r12, r1)
            android.os.Parcelable$Creator<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r0 = com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment.CREATOR
            java.util.ArrayList r3 = r12.createTypedArrayList(r0)
            if (r3 == 0) goto L_0x0052
        L_0x000d:
            int r4 = r12.readInt()
            int r5 = r12.readInt()
            long r6 = r12.readLong()
            long r8 = r12.readLong()
            java.lang.String r10 = ""
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r8, r10)
            java.lang.String r0 = r12.readString()
            if (r0 != 0) goto L_0x0050
        L_0x0029:
            r11.draftDir = r1
            int r0 = r12.readInt()
            r11.calculateWidth = r0
            int r0 = r12.readInt()
            r11.calculateHeight = r0
            int r0 = r12.readInt()
            r11.previewVideoLength = r0
            java.lang.String[] r0 = r12.createStringArray()
            r11.reverseVideoArray = r0
            java.lang.String[] r0 = r12.createStringArray()
            r11.reverseAudioArray = r0
            java.lang.String[] r0 = r12.createStringArray()
            r11.tempVideoArray = r0
            return
        L_0x0050:
            r1 = r0
            goto L_0x0029
        L_0x0052:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeTypedList(this.videoList);
        parcel.writeInt(this.previewWidth);
        parcel.writeInt(this.previewHeight);
        parcel.writeLong(this.sceneIn);
        parcel.writeLong(this.sceneOut);
        parcel.writeString(this.draftDir);
        parcel.writeInt(this.calculateWidth);
        parcel.writeInt(this.calculateHeight);
        parcel.writeInt(this.previewVideoLength);
        parcel.writeStringArray(this.reverseVideoArray);
        parcel.writeStringArray(this.reverseAudioArray);
        parcel.writeStringArray(this.tempVideoArray);
    }

    public final void updateReverseVideoContent(String[] strArr, String[] strArr2, String[] strArr3) {
        this.reverseVideoArray = strArr;
        this.reverseAudioArray = strArr2;
        this.tempVideoArray = strArr3;
    }

    public EditPreviewInfo(List<EditVideoSegment> list, int i, int i2, long j, long j2, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        this.videoList = list;
        this.previewWidth = i;
        this.previewHeight = i2;
        this.sceneIn = j;
        this.sceneOut = j2;
        this.initDraftDir = str;
        this.draftDir = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditPreviewInfo(List list, int i, int i2, long j, long j2, String str, int i3, C89214g gVar) {
        this(list, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? -1 : j, (i3 & 16) != 0 ? -1 : j2, str);
    }
}
