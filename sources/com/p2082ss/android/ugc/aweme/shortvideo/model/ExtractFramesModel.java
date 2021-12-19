package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27917g;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel */
public final class ExtractFramesModel implements Serializable {
    @AbstractC27891c(mo46611a = "extractFramesDir")
    private String extractFramesDir = "";
    @AbstractC27891c(mo46611a = "extractType")
    private String extractType;
    @AbstractC27891c(mo46611a = "frames")
    private HashMap<Integer, ArrayList<String>> frames = new HashMap<>();
    @AbstractC27891c(mo46611a = "framesTimestamp")
    private HashMap<String, Long> framesTimestamp = new HashMap<>();
    @AbstractC27891c(mo46611a = "frames_v1")
    private HashMap<Integer, ArrayList<FrameItem>> framesV1 = new HashMap<>();
    @AbstractC27891c(mo46611a = "multiStickersMap")
    private HashMap<Integer, List<String>> multiStickers = new HashMap<>();
    @AbstractC27891c(mo46611a = "segmentEffectPhoto")
    private HashMap<String, List<String>> segmentEffectPhoto;
    @AbstractC27891c(mo46611a = "segmentFrameKey")
    private HashMap<Integer, String> segmentFrameKeys = new HashMap<>();
    private String stickerIds;
    @AbstractC27891c(mo46611a = "stickerFacesMap")
    private final HashMap<Integer, String> stickerPersons = new HashMap<>();

    static {
        Covode.recordClassIndex(84576);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_model_ExtractFramesModel_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m127076x192eb61a(String str, String str2) {
        return 0;
    }

    private static /* synthetic */ void getStickerPersons$annotations() {
    }

    public final String getExtractFramesDir() {
        return this.extractFramesDir;
    }

    public final String getExtractType() {
        return this.extractType;
    }

    public final HashMap<Integer, ArrayList<String>> getFrames() {
        return this.frames;
    }

    public final HashMap<String, Long> getFramesTimestamp() {
        return this.framesTimestamp;
    }

    public final HashMap<Integer, ArrayList<FrameItem>> getFramesV1() {
        return this.framesV1;
    }

    public final HashMap<Integer, List<String>> getMultiStickers() {
        return this.multiStickers;
    }

    public final HashMap<String, List<String>> getSegmentEffectPhoto() {
        return this.segmentEffectPhoto;
    }

    public final HashMap<Integer, String> getSegmentFrameKeys() {
        return this.segmentFrameKeys;
    }

    public final String getStickerIds() {
        return this.stickerIds;
    }

    public final HashMap<Integer, String> getStickerPersons() {
        return this.stickerPersons;
    }

    private final boolean isOldVersion() {
        if (!this.frames.isEmpty()) {
            return true;
        }
        return false;
    }

    public final int getFrameSize() {
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            return hashMap.size();
        }
        return 0;
    }

    public final void initSegmentEffectPhoto() {
        if (this.segmentEffectPhoto == null) {
            this.segmentEffectPhoto = new HashMap<>();
        }
    }

    public final void clearAllFrames() {
        this.frames.clear();
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<Integer, String> hashMap2 = this.segmentFrameKeys;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
    }

    public final void removeFileAndResetData() {
        C84902i.m145899c(this.extractFramesDir);
        C84902i.m145896b(this.extractFramesDir);
        clearAllFrames();
        m127076x192eb61a("jw", "remove file and reset data");
    }

    public final void removeMultiImages() {
        HashMap<Integer, List<String>> hashMap = this.multiStickers;
        if (hashMap != null && (!hashMap.isEmpty())) {
            hashMap.remove(Integer.valueOf(getFrameSize()));
        }
    }

    public final String toString() {
        String b = new C27917g().mo46682b().mo46674b(this);
        C89219l.m154716b(b, "");
        return b;
    }

    public final void removeLastSegment() {
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null && (!hashMap.isEmpty())) {
            hashMap.remove(Integer.valueOf(hashMap.size() - 1));
        }
        HashMap<Integer, String> hashMap2 = this.segmentFrameKeys;
        if (hashMap2 != null && (!hashMap2.isEmpty())) {
            HashMap<Integer, String> hashMap3 = this.segmentFrameKeys;
            hashMap3.remove(Integer.valueOf(hashMap3.size() - 1));
        }
    }

    public final ExtractFramesModel copy() {
        HashMap<Integer, List<String>> multiStickers2;
        HashMap<Integer, ArrayList<FrameItem>> hashMap;
        ExtractFramesModel extractFramesModel = new ExtractFramesModel(this.extractType);
        extractFramesModel.extractFramesDir = this.extractFramesDir;
        if (!this.frames.isEmpty()) {
            extractFramesModel.frames.putAll(this.frames);
        }
        HashMap<Integer, ArrayList<FrameItem>> hashMap2 = this.framesV1;
        if (!(hashMap2 == null || !(!hashMap2.isEmpty()) || (hashMap = extractFramesModel.framesV1) == null)) {
            hashMap.putAll(hashMap2);
        }
        HashMap<Integer, String> hashMap3 = this.stickerPersons;
        if (hashMap3 != null && (!hashMap3.isEmpty())) {
            C89041ag.m154426b(extractFramesModel.getStickerPersons(), this.stickerPersons);
        }
        HashMap<Integer, List<String>> hashMap4 = this.multiStickers;
        if (!(hashMap4 == null || !(!hashMap4.isEmpty()) || (multiStickers2 = extractFramesModel.getMultiStickers()) == null)) {
            C89041ag.m154426b(multiStickers2, hashMap4);
        }
        return extractFramesModel;
    }

    public final ExtractFramesModel convertToV1IfNeed() {
        LinkedHashMap linkedHashMap;
        if (isOldVersion()) {
            this.framesV1 = new HashMap<>();
            for (Map.Entry<Integer, ArrayList<String>> entry : this.frames.entrySet()) {
                ArrayList<String> value = entry.getValue();
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) value, 10));
                for (T t : value) {
                    FrameItem frameItem = new FrameItem(t, 0, 0, 6, null);
                    HashMap<String, Long> hashMap = this.framesTimestamp;
                    if (!(hashMap == null || hashMap.get(t) == null)) {
                        Long l = this.framesTimestamp.get(t);
                        if (l == null) {
                            C89219l.m154715b();
                        }
                        if (l.longValue() >= 0) {
                            Long l2 = this.framesTimestamp.get(t);
                            if (l2 == null) {
                                C89219l.m154715b();
                            }
                            frameItem.setTimeStamp(l2.longValue());
                        }
                    }
                    arrayList.add(frameItem);
                }
                ArrayList arrayList2 = arrayList;
                HashMap<Integer, ArrayList<FrameItem>> hashMap2 = this.framesV1;
                if (hashMap2 != null) {
                    hashMap2.put(entry.getKey(), new ArrayList<>(arrayList2));
                }
            }
            HashMap<Integer, List<String>> hashMap3 = this.multiStickers;
            if (hashMap3 == null || hashMap3.isEmpty()) {
                HashMap<Integer, List<String>> hashMap4 = new HashMap<>();
                this.multiStickers = hashMap4;
                HashMap<Integer, String> hashMap5 = this.stickerPersons;
                if (hashMap5 != null) {
                    linkedHashMap = new LinkedHashMap(C89041ag.m154411a(hashMap5.size()));
                    for (T t2 : hashMap5.entrySet()) {
                        linkedHashMap.put(t2.getKey(), C89070n.m154516a(t2.getValue()));
                    }
                } else {
                    linkedHashMap = null;
                }
                C89041ag.m154426b(hashMap4, linkedHashMap);
            }
            this.frames.clear();
            HashMap<String, Long> hashMap6 = this.framesTimestamp;
            if (hashMap6 != null) {
                hashMap6.clear();
            }
        }
        return this;
    }

    public final List<FrameItem> getAllFrames() {
        ArrayList arrayList = new ArrayList();
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            for (Map.Entry<Integer, ArrayList<FrameItem>> entry : hashMap.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    arrayList.addAll(entry.getValue());
                }
            }
        }
        for (Map.Entry<Integer, String> entry2 : this.stickerPersons.entrySet()) {
            if (entry2.getValue().length() > 0) {
                arrayList.add(new FrameItem(entry2.getValue(), 0, 0, 6, null));
            }
        }
        HashMap<Integer, List<String>> hashMap2 = this.multiStickers;
        if (hashMap2 != null) {
            for (Map.Entry<Integer, List<String>> entry3 : hashMap2.entrySet()) {
                if (!entry3.getValue().isEmpty()) {
                    List<String> value = entry3.getValue();
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) value, 10));
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new FrameItem(it.next(), 0, 0, 6, null));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public final void setFramesV1(HashMap<Integer, ArrayList<FrameItem>> hashMap) {
        this.framesV1 = hashMap;
    }

    public final void setSegmentEffectPhoto(HashMap<String, List<String>> hashMap) {
        this.segmentEffectPhoto = hashMap;
    }

    public final void setStickerIds(String str) {
        this.stickerIds = str;
    }

    public final void setExtractFramesDir(String str) {
        C89219l.m154721d(str, "");
        this.extractFramesDir = str;
    }

    public final void setExtractType(String str) {
        C89219l.m154721d(str, "");
        this.extractType = str;
    }

    public final void setFrames(HashMap<Integer, ArrayList<String>> hashMap) {
        C89219l.m154721d(hashMap, "");
        this.frames = hashMap;
    }

    public final void setFramesTimestamp(HashMap<String, Long> hashMap) {
        C89219l.m154721d(hashMap, "");
        this.framesTimestamp = hashMap;
    }

    public final void setSegmentFrameKeys(HashMap<Integer, String> hashMap) {
        C89219l.m154721d(hashMap, "");
        this.segmentFrameKeys = hashMap;
    }

    public final void addMultiImages(List<String> list) {
        C89219l.m154721d(list, "");
        int frameSize = getFrameSize();
        HashMap<Integer, List<String>> hashMap = this.multiStickers;
        if (hashMap != null) {
            hashMap.put(Integer.valueOf(frameSize), list);
        }
    }

    public final void addMultiImagesAfterShoot(List<String> list) {
        C89219l.m154721d(list, "");
        int frameSize = getFrameSize() - 1;
        HashMap<Integer, List<String>> hashMap = this.multiStickers;
        if (hashMap != null) {
            hashMap.put(Integer.valueOf(frameSize), list);
        }
    }

    public ExtractFramesModel(String str) {
        C89219l.m154721d(str, "");
        this.extractType = str;
    }

    public final void addFrameAtLastSegment(FrameItem frameItem) {
        C89219l.m154721d(frameItem, "");
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap == null) {
            return;
        }
        if (hashMap.get(Integer.valueOf(hashMap.size() - 1)) != null) {
            ArrayList<FrameItem> arrayList = hashMap.get(Integer.valueOf(hashMap.size() - 1));
            if (arrayList != null) {
                arrayList.add(frameItem);
                return;
            }
            return;
        }
        Set<Integer> keySet = hashMap.keySet();
        C89219l.m154716b(keySet, "");
        C89219l.m154721d(keySet, "");
        ArrayList<FrameItem> arrayList2 = hashMap.get(C89070n.m154596p(keySet));
        if (arrayList2 != null) {
            arrayList2.add(frameItem);
        }
    }

    public final void addFrameSegment(ArrayList<FrameItem> arrayList, String str) {
        C89219l.m154721d(arrayList, "");
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            hashMap.put(Integer.valueOf(hashMap.size()), arrayList);
        }
        HashMap<Integer, String> hashMap2 = this.segmentFrameKeys;
        if (hashMap2 != null) {
            hashMap2.put(Integer.valueOf(hashMap2.size()), str);
        }
    }

    public final void bindSegmentEffectPhoto(List<String> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        HashMap<String, List<String>> hashMap = this.segmentEffectPhoto;
        if (hashMap != null) {
            if (!hashMap.containsKey(str)) {
                HashMap<String, List<String>> hashMap2 = this.segmentEffectPhoto;
                if (hashMap2 == null) {
                    C89219l.m154715b();
                }
                hashMap2.put(str, new ArrayList());
            }
            HashMap<String, List<String>> hashMap3 = this.segmentEffectPhoto;
            if (hashMap3 == null) {
                C89219l.m154715b();
            }
            List<String> list2 = hashMap3.get(str);
            if (list2 != null) {
                list2.addAll(list);
            }
        }
    }

    public static /* synthetic */ void addFrameSegment$default(ExtractFramesModel extractFramesModel, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        extractFramesModel.addFrameSegment(arrayList, str);
    }
}
