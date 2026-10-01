package com.chunkytofustudios.native_geofence.util

import com.chunkytofustudios.native_geofence.generated.ActiveGeofenceWire
import com.chunkytofustudios.native_geofence.generated.GeofenceWire

class ActiveGeofenceWires {
    companion object {
        fun fromGeofenceWire(e: GeofenceWire): ActiveGeofenceWire {
            return ActiveGeofenceWire(
                e.id,
                e.location,
                e.radiusMeters,
                e.triggers,
                e.androidSettings
            )
        }
    }
}
