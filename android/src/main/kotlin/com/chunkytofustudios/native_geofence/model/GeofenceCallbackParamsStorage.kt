package com.chunkytofustudios.native_geofence.model

import com.chunkytofustudios.native_geofence.generated.GeofenceEvent
import kotlinx.serialization.Serializable

// Marketdey fork: WorkManager keeps this on disk, so it holds ids only — no centre, no radius.
@Serializable
class GeofenceCallbackParamsStorage(
    val geofenceIds: List<String>,
    val event: GeofenceEvent,
    val callbackHandle: Long
)
