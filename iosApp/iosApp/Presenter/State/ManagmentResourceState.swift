//
//  ResView.swift
//  iosApp
//
//  Created by Никита on 27.06.2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct ManagmentResourceState<T : AnyObject, SuccessView : View, ErrorResult: View>: View {
    private let resourceState: BasicUiState<T>
    private let successView: (T?) -> SuccessView
    private let errorResult: (T?) -> ErrorResult

    init(
        resourceState: BasicUiState<T>,
        successView:  @escaping (T?) -> SuccessView,
        errorResult: @escaping (T?) -> ErrorResult
    ) {
        self.resourceState = resourceState
        self.successView = successView
        self.errorResult = errorResult
    }
    
    var body: some View {
        switch self.resourceState {
            case let error as BasicUiStateError:
                errorResult(error.message as? T)
            case is BasicUiStateLoading:
                LoadingView()
            case let success as BasicUiStateSuccess<T>:
                successView(success.data)
            default:
                Text("Если вы видите данное сообщение то произошла ошибка в приложении напишите нам на почту для устранения багов")
        }
    }
}
