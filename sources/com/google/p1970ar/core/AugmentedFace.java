package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Collection;

/* renamed from: com.google.ar.core.AugmentedFace */
public class AugmentedFace extends TrackableBase {
    private FloatBuffer normalsBuffer;
    private FloatBuffer textureCoordinatesBuffer;
    private ShortBuffer triangleIndicesBuffer;
    private FloatBuffer verticesBuffer;

    static {
        Covode.recordClassIndex(32567);
    }

    private native Pose nativeGetCenterPose(long j, long j2);

    private native ByteBuffer nativeGetMeshNormalsByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshTextureCoordinatesByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshTriangleIndicesByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshVerticesByteBuffer(long j, long j2);

    private native Pose nativeGetRegionPose(long j, long j2, int i);

    @Override // com.google.p1970ar.core.TrackableBase, com.google.p1970ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.p1970ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.p1970ar.core.TrackableBase, com.google.p1970ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public FloatBuffer getMeshNormals() {
        return this.normalsBuffer;
    }

    public FloatBuffer getMeshTextureCoordinates() {
        return this.textureCoordinatesBuffer;
    }

    public ShortBuffer getMeshTriangleIndices() {
        return this.triangleIndicesBuffer;
    }

    public FloatBuffer getMeshVertices() {
        return this.verticesBuffer;
    }

    @Override // com.google.p1970ar.core.TrackableBase, com.google.p1970ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.p1970ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    protected AugmentedFace() {
        super(0, null);
    }

    public Pose getCenterPose() {
        MethodCollector.m26663i(8980);
        Pose nativeGetCenterPose = nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(8980);
        return nativeGetCenterPose;
    }

    /* renamed from: com.google.ar.core.AugmentedFace$RegionType */
    public enum RegionType {
        NOSE_TIP(0),
        FOREHEAD_LEFT(1),
        FOREHEAD_RIGHT(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32568);
        }

        private RegionType(int i) {
            this.nativeCode = i;
        }
    }

    /* access modifiers changed from: package-private */
    public void populateMeshData() {
        MethodCollector.m26663i(8527);
        this.verticesBuffer = Session.directByteBufferOrDefault(nativeGetMeshVerticesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.normalsBuffer = Session.directByteBufferOrDefault(nativeGetMeshNormalsByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.textureCoordinatesBuffer = Session.directByteBufferOrDefault(nativeGetMeshTextureCoordinatesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.triangleIndicesBuffer = Session.directByteBufferOrDefault(nativeGetMeshTriangleIndicesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asShortBuffer();
        MethodCollector.m26664o(8527);
    }

    public Pose getRegionPose(RegionType regionType) {
        MethodCollector.m26663i(8831);
        Pose nativeGetRegionPose = nativeGetRegionPose(this.session.nativeWrapperHandle, this.nativeHandle, regionType.nativeCode);
        MethodCollector.m26664o(8831);
        return nativeGetRegionPose;
    }

    AugmentedFace(long j, Session session) {
        super(j, session);
        populateMeshData();
    }
}
