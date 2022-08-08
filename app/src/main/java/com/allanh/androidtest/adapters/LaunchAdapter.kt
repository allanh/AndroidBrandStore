package com.allanh.androidtest.adapters

import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.allanh.androidtest.models.LaunchData


class LaunchAdapter : ListAdapter<LaunchData, RecyclerView.ViewHolder>(LaunchDataDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PlantViewHolder(ComposeView(parent.context))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val plant = getItem(position)
        (holder as PlantViewHolder).bind(plant)
    }

    class PlantViewHolder(
        composeView: ComposeView
    ) : RecyclerView.ViewHolder(composeView) {
        fun bind(data: LaunchData) {
//            (itemView as ComposeView).setContent {
//                MdcTheme {
//                    PlantListItemView(plant = plant) {
//                        navigateToPlant(plant)
//                    }
//                }
//            }
        }

//        private fun navigateToPlant(plant: Plant) {
//            val direction =
//                HomeViewPagerFragmentDirections.actionViewPagerFragmentToPlantDetailFragment(
//                    plant.plantId
//                )
//            itemView.findNavController().navigate(direction)
//        }
    }
}

private class LaunchDataDiffCallback : DiffUtil.ItemCallback<LaunchData>() {

    override fun areItemsTheSame(oldItem: LaunchData, newItem: LaunchData): Boolean {
        return oldItem.mission_id == newItem.mission_id
    }

    override fun areContentsTheSame(oldItem: LaunchData, newItem: LaunchData): Boolean {
        return oldItem == newItem
    }
}
